package ni.com.sts.retirosCSSFV.Dao;

import ni.com.sts.retirosCSSFV.conexion.HibernateUtil;
import ni.com.sts.retirosCSSFV.dominio.DocumentacionRetiroData;
import ni.com.sts.retirosCSSFV.dominio.Mensajes;
import ni.com.sts.retirosCSSFV.dominio.ParticipantesProcesos;
import ni.com.sts.retirosCSSFV.dto.ParticipanteDto;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.transform.AliasToBeanResultTransformer;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

/**
 * Created by ICS on 18/01/2022.
 */
@Transactional
public class ParticipanteDao {

    private static Logger logger = Logger.getLogger(ParticipanteDao.class);
    /**
     * Obtengo la lista de participantes >= 18 años de edad del estudio de Dengue.
     * @param edadMax -> Edad limite para participante en el estudio de Dengue:  18 años.
     * @param tomorrow -> Representa el día de Mañana
     * @return participanteDtoList lista de participante de Dengue a los cuales se va retirar del estudio.
     * @throws HibernateException
     */
    public List<ParticipanteDto> ObtenerListaParticipantesDengue(Integer edadMax, Date tomorrow) throws HibernateException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<ParticipanteDto>participanteDtoList = null;
        try {
            participanteDtoList = session.createQuery("select p.codigo as codigo_participante, pp.estudio as estudios, p.codigoCasa as casaPDCS, coalesce(pp.casaChf, '0') as casaFamilia, " +
                    " pp.estPart as estado_participante, floor( fn_edad_meses(p.fechanac, :tomorrow )/12) as edad " +
                    " from Participantes p, ParticipantesProcesos pp " +
                    " where p.codigo=pp.codigo and pp.estPart=1 and pp.estudio like '%Dengue%' and floor(fn_edad_meses(p.fechanac, :tomorrow)/12)>=:edadMax")
                    .setParameter("edadMax",edadMax)
                    .setParameter("tomorrow",tomorrow)
                    .setResultTransformer(new AliasToBeanResultTransformer(ParticipanteDto.class)).getResultList();
        }catch (Exception e){
            logger.error("Error al obtener los participantes de Dengue: " + e.getMessage());
        }
        return participanteDtoList;
    }

    /**
     * Obtengo la lista de participantes >= 15 años de edad del estudio de Influenza.
     * @param edadMaxFlu -> Edad limite para participar en el estudio de Influenza
     * @param tomorrow -> Representa el día de mañana
     * @return Lista de participantes de Influenza
     * @throws HibernateException
     */
    public List<ParticipanteDto>ObtenerListaParticipantesInfluenza(Integer edadMaxFlu, Date tomorrow)throws HibernateException{
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<ParticipanteDto> participanteDtoListFlu = null;
        try{
            participanteDtoListFlu = session.createQuery("select p.codigo as codigo_participante, pp.estudio as estudios, p.codigoCasa as casaPDCS,coalesce(pp.casaChf, '0') as casaFamilia, " +
                    " floor( fn_edad_meses(p.fechanac, :tomorrow )/12) as edad " +
                    " from Participantes p, ParticipantesProcesos pp " +
                    " where p.codigo=pp.codigo " +
                    " and pp.estPart=1 and pp.estudio like '%Influenza%' and floor(fn_edad_meses(p.fechanac, :tomorrow)/12)>=:edadMaxFlu ")
                    .setParameter("edadMaxFlu",edadMaxFlu)
                    .setParameter("tomorrow", tomorrow)
                    .setResultTransformer(new AliasToBeanResultTransformer(ParticipanteDto.class)).getResultList();
        }catch (Exception e){
            logger.error("Error al obtener participantes de Influenza: "+ e.getMessage());
        }
        return participanteDtoListFlu;
    }

    /**
     *  Obtengo la lista de participantes >= 15 años de edad del estudio de UO1.
     * @param edadMaxUO1 -> Edad limite para participar en el estudio de UO1
     * @param tomorrow -> Representa el día de mañana.
     * @return Lista de participantes del estudio de UO1
     * @throws HibernateException
     */
    public List<ParticipanteDto>ObtenerListaParticipantesUO1(Integer edadMaxUO1, Date tomorrow)throws HibernateException{
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<ParticipanteDto> participanteDtoListUO1 = null;
        try{
            participanteDtoListUO1 = session.createQuery("select p.codigo as codigo_participante, pp.estudio as estudios, p.codigoCasa as casaPDCS,coalesce(pp.casaChf, '0') as casaFamilia, " +
                    " floor( fn_edad_meses(p.fechanac, :tomorrow )/12) as edad " +
                    " from Participantes p, ParticipantesProcesos pp " +
                    " where p.codigo=pp.codigo " +
                    " and pp.estPart=1 and pp.estudio like '%UO1%' and floor(fn_edad_meses(p.fechanac, :tomorrow)/12)>=:edadMaxUO1 ")
                    .setParameter("edadMaxUO1",edadMaxUO1)
                    .setParameter("tomorrow", tomorrow)
                    .setResultTransformer(new AliasToBeanResultTransformer(ParticipanteDto.class)).getResultList();
        }catch (Exception e){
            logger.error("Hubo un error al obtener participantes de UO1:" +e.getMessage());
        }
        return participanteDtoListUO1;
    }

    /**
     *  Obtengo los procesos de cada participantes los cuales serán retirados
     * @param codigo_participante -> paso el código de participante
     * @param session -> Sessión Actual.
     * @return
     */
    public ParticipantesProcesos getParticipanteProceso(Integer codigo_participante, Session session){
        ParticipantesProcesos procesos = null;
        try {
            String hql = "from ParticipantesProcesos pp where pp.codigo=:codigo_participante";
            Query query = session.createQuery(hql);
            query.setParameter("codigo_participante",codigo_participante);
            procesos = (ParticipantesProcesos) query.getSingleResult();
        }catch (Exception e){
            logger.error("Error al obtener procesos del participante: "+ e.getMessage());
        }
        return procesos;
    }

    /**
     * Método Actualiza los campos: estudio y est_part (si es necesario) en tabla participantes_procesos
     * @param participantesProcesos -> participante a quiern debe actualizase.
     * @param session -> Sessión actual
     * @return Verdadero si se actualizó, de lo contrario de vuelve Falso.
     */
    public boolean saveOrUpdateProcesos(ParticipantesProcesos participantesProcesos, Session session){
        try {
            session.beginTransaction();
            String studios = participantesProcesos.getEstudio();
            Integer est = participantesProcesos.getEstPart();
            Integer codigo = participantesProcesos.getCodigo();
            Query query = session.createQuery("update ParticipantesProcesos pp set pp.estudio=:studios, pp.estPart=:est where pp.codigo=:codigo ");
            query.setParameter("studios", studios);
            query.setParameter("est", est);
            query.setParameter("codigo", codigo);
            query.executeUpdate();
            session.getTransaction().commit();
            return true;
        }catch (Exception e){
            logger.error("Error al actualizar los procesos, codigo_participante :"+ participantesProcesos.getCodigo()+ " error: " +e.getMessage());
            session.getTransaction().rollback();
            return false;
        }
    }


    /**
     * Método Guarda Información en la tabla de documentacion_retiro_data
     * @param retiro -> Información del Retiro
     * @param session -> Sessión actual
     * @return Información del nuevo Retiro guardado.
     */
    public DocumentacionRetiroData saveRetiro(DocumentacionRetiroData retiro, Session session){
        try{
            session.beginTransaction();
            session.save(retiro);
            session.getTransaction().commit();
        }catch (Exception e){
            logger.error("Error al guardar informacion: "+ retiro.getCodigoParticipante()+" ERROR: ->"+ e.getMessage());
            session.getTransaction().rollback();
        }
        return retiro;
    }

    /**
     * Obtengo el la Edad según el catálogo requerido
     * @param catalogo -> Nombre del catálogo
     * @param session -> Sessión actual
     * @return
     */
    @SuppressWarnings("unchecked")
    public List<Mensajes> getCatalogo(String catalogo, Session session){
        List<Mensajes> listMessage = null;
        try{
        Query query = session.createQuery("FROM Mensajes mens where mens.isCat ='0'" +
                " and mens.catRoot =:catalogo and mens.catKey is not null and mens.catPasive = '0' order by mens.orden");
        query.setParameter("catalogo", catalogo);
        listMessage = (List<Mensajes>) query.list();
            return listMessage;
        }catch (Exception e){
            logger.error("Ha ocurrido un error al obtener catalogo mensajes: "+ catalogo  +" ERROR: "+ e.getMessage());
            return listMessage;
        }
    }

}
