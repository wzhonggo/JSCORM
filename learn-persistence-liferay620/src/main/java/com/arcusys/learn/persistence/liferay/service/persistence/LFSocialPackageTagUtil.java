package com.arcusys.learn.persistence.liferay.service.persistence;

import com.arcusys.learn.persistence.liferay.model.LFSocialPackageTag;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the l f social package tag service. This utility wraps {@link LFSocialPackageTagPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFSocialPackageTagPersistence
 * @see LFSocialPackageTagPersistenceImpl
 * @generated
 */
public class LFSocialPackageTagUtil {
    private static LFSocialPackageTagPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(LFSocialPackageTag lfSocialPackageTag) {
        getPersistence().clearCache(lfSocialPackageTag);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<LFSocialPackageTag> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<LFSocialPackageTag> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<LFSocialPackageTag> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static LFSocialPackageTag update(
        LFSocialPackageTag lfSocialPackageTag) throws SystemException {
        return getPersistence().update(lfSocialPackageTag);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static LFSocialPackageTag update(
        LFSocialPackageTag lfSocialPackageTag, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(lfSocialPackageTag, serviceContext);
    }

    /**
    * Returns all the l f social package tags where name = &#63;.
    *
    * @param name the name
    * @return the matching l f social package tags
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFSocialPackageTag> findByName(
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByName(name);
    }

    /**
    * Returns a range of all the l f social package tags where name = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFSocialPackageTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param name the name
    * @param start the lower bound of the range of l f social package tags
    * @param end the upper bound of the range of l f social package tags (not inclusive)
    * @return the range of matching l f social package tags
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFSocialPackageTag> findByName(
        java.lang.String name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByName(name, start, end);
    }

    /**
    * Returns an ordered range of all the l f social package tags where name = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFSocialPackageTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param name the name
    * @param start the lower bound of the range of l f social package tags
    * @param end the upper bound of the range of l f social package tags (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching l f social package tags
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFSocialPackageTag> findByName(
        java.lang.String name, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByName(name, start, end, orderByComparator);
    }

    /**
    * Returns the first l f social package tag in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f social package tag
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFSocialPackageTagException if a matching l f social package tag could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFSocialPackageTag findByName_First(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFSocialPackageTagException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByName_First(name, orderByComparator);
    }

    /**
    * Returns the first l f social package tag in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f social package tag, or <code>null</code> if a matching l f social package tag could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFSocialPackageTag fetchByName_First(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByName_First(name, orderByComparator);
    }

    /**
    * Returns the last l f social package tag in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f social package tag
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFSocialPackageTagException if a matching l f social package tag could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFSocialPackageTag findByName_Last(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFSocialPackageTagException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByName_Last(name, orderByComparator);
    }

    /**
    * Returns the last l f social package tag in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f social package tag, or <code>null</code> if a matching l f social package tag could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFSocialPackageTag fetchByName_Last(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByName_Last(name, orderByComparator);
    }

    /**
    * Returns the l f social package tags before and after the current l f social package tag in the ordered set where name = &#63;.
    *
    * @param id the primary key of the current l f social package tag
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next l f social package tag
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFSocialPackageTagException if a l f social package tag with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFSocialPackageTag[] findByName_PrevAndNext(
        long id, java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFSocialPackageTagException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByName_PrevAndNext(id, name, orderByComparator);
    }

    /**
    * Removes all the l f social package tags where name = &#63; from the database.
    *
    * @param name the name
    * @throws SystemException if a system exception occurred
    */
    public static void removeByName(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByName(name);
    }

    /**
    * Returns the number of l f social package tags where name = &#63;.
    *
    * @param name the name
    * @return the number of matching l f social package tags
    * @throws SystemException if a system exception occurred
    */
    public static int countByName(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByName(name);
    }

    /**
    * Returns all the l f social package tags where socialPackageID = &#63;.
    *
    * @param socialPackageID the social package i d
    * @return the matching l f social package tags
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFSocialPackageTag> findBySocialPackageID(
        java.lang.Integer socialPackageID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBySocialPackageID(socialPackageID);
    }

    /**
    * Returns a range of all the l f social package tags where socialPackageID = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFSocialPackageTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param socialPackageID the social package i d
    * @param start the lower bound of the range of l f social package tags
    * @param end the upper bound of the range of l f social package tags (not inclusive)
    * @return the range of matching l f social package tags
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFSocialPackageTag> findBySocialPackageID(
        java.lang.Integer socialPackageID, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBySocialPackageID(socialPackageID, start, end);
    }

    /**
    * Returns an ordered range of all the l f social package tags where socialPackageID = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFSocialPackageTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param socialPackageID the social package i d
    * @param start the lower bound of the range of l f social package tags
    * @param end the upper bound of the range of l f social package tags (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching l f social package tags
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFSocialPackageTag> findBySocialPackageID(
        java.lang.Integer socialPackageID, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBySocialPackageID(socialPackageID, start, end,
            orderByComparator);
    }

    /**
    * Returns the first l f social package tag in the ordered set where socialPackageID = &#63;.
    *
    * @param socialPackageID the social package i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f social package tag
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFSocialPackageTagException if a matching l f social package tag could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFSocialPackageTag findBySocialPackageID_First(
        java.lang.Integer socialPackageID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFSocialPackageTagException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBySocialPackageID_First(socialPackageID,
            orderByComparator);
    }

    /**
    * Returns the first l f social package tag in the ordered set where socialPackageID = &#63;.
    *
    * @param socialPackageID the social package i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f social package tag, or <code>null</code> if a matching l f social package tag could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFSocialPackageTag fetchBySocialPackageID_First(
        java.lang.Integer socialPackageID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchBySocialPackageID_First(socialPackageID,
            orderByComparator);
    }

    /**
    * Returns the last l f social package tag in the ordered set where socialPackageID = &#63;.
    *
    * @param socialPackageID the social package i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f social package tag
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFSocialPackageTagException if a matching l f social package tag could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFSocialPackageTag findBySocialPackageID_Last(
        java.lang.Integer socialPackageID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFSocialPackageTagException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBySocialPackageID_Last(socialPackageID,
            orderByComparator);
    }

    /**
    * Returns the last l f social package tag in the ordered set where socialPackageID = &#63;.
    *
    * @param socialPackageID the social package i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f social package tag, or <code>null</code> if a matching l f social package tag could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFSocialPackageTag fetchBySocialPackageID_Last(
        java.lang.Integer socialPackageID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchBySocialPackageID_Last(socialPackageID,
            orderByComparator);
    }

    /**
    * Returns the l f social package tags before and after the current l f social package tag in the ordered set where socialPackageID = &#63;.
    *
    * @param id the primary key of the current l f social package tag
    * @param socialPackageID the social package i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next l f social package tag
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFSocialPackageTagException if a l f social package tag with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFSocialPackageTag[] findBySocialPackageID_PrevAndNext(
        long id, java.lang.Integer socialPackageID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFSocialPackageTagException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBySocialPackageID_PrevAndNext(id, socialPackageID,
            orderByComparator);
    }

    /**
    * Removes all the l f social package tags where socialPackageID = &#63; from the database.
    *
    * @param socialPackageID the social package i d
    * @throws SystemException if a system exception occurred
    */
    public static void removeBySocialPackageID(
        java.lang.Integer socialPackageID)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeBySocialPackageID(socialPackageID);
    }

    /**
    * Returns the number of l f social package tags where socialPackageID = &#63;.
    *
    * @param socialPackageID the social package i d
    * @return the number of matching l f social package tags
    * @throws SystemException if a system exception occurred
    */
    public static int countBySocialPackageID(java.lang.Integer socialPackageID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBySocialPackageID(socialPackageID);
    }

    /**
    * Caches the l f social package tag in the entity cache if it is enabled.
    *
    * @param lfSocialPackageTag the l f social package tag
    */
    public static void cacheResult(
        com.arcusys.learn.persistence.liferay.model.LFSocialPackageTag lfSocialPackageTag) {
        getPersistence().cacheResult(lfSocialPackageTag);
    }

    /**
    * Caches the l f social package tags in the entity cache if it is enabled.
    *
    * @param lfSocialPackageTags the l f social package tags
    */
    public static void cacheResult(
        java.util.List<com.arcusys.learn.persistence.liferay.model.LFSocialPackageTag> lfSocialPackageTags) {
        getPersistence().cacheResult(lfSocialPackageTags);
    }

    /**
    * Creates a new l f social package tag with the primary key. Does not add the l f social package tag to the database.
    *
    * @param id the primary key for the new l f social package tag
    * @return the new l f social package tag
    */
    public static com.arcusys.learn.persistence.liferay.model.LFSocialPackageTag create(
        long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the l f social package tag with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the l f social package tag
    * @return the l f social package tag that was removed
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFSocialPackageTagException if a l f social package tag with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFSocialPackageTag remove(
        long id)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFSocialPackageTagException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(id);
    }

    public static com.arcusys.learn.persistence.liferay.model.LFSocialPackageTag updateImpl(
        com.arcusys.learn.persistence.liferay.model.LFSocialPackageTag lfSocialPackageTag)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(lfSocialPackageTag);
    }

    /**
    * Returns the l f social package tag with the primary key or throws a {@link com.arcusys.learn.persistence.liferay.NoSuchLFSocialPackageTagException} if it could not be found.
    *
    * @param id the primary key of the l f social package tag
    * @return the l f social package tag
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFSocialPackageTagException if a l f social package tag with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFSocialPackageTag findByPrimaryKey(
        long id)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFSocialPackageTagException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the l f social package tag with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the l f social package tag
    * @return the l f social package tag, or <code>null</code> if a l f social package tag with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFSocialPackageTag fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the l f social package tags.
    *
    * @return the l f social package tags
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFSocialPackageTag> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the l f social package tags.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFSocialPackageTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of l f social package tags
    * @param end the upper bound of the range of l f social package tags (not inclusive)
    * @return the range of l f social package tags
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFSocialPackageTag> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the l f social package tags.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFSocialPackageTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of l f social package tags
    * @param end the upper bound of the range of l f social package tags (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of l f social package tags
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFSocialPackageTag> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the l f social package tags from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of l f social package tags.
    *
    * @return the number of l f social package tags
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static LFSocialPackageTagPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (LFSocialPackageTagPersistence) PortletBeanLocatorUtil.locate(com.arcusys.learn.persistence.liferay.service.ClpSerializer.getServletContextName(),
                    LFSocialPackageTagPersistence.class.getName());

            ReferenceRegistry.registerReference(LFSocialPackageTagUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(LFSocialPackageTagPersistence persistence) {
    }
}
