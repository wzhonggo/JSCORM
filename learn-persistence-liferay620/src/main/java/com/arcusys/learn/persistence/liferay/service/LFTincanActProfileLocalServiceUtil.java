package com.arcusys.learn.persistence.liferay.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for LFTincanActProfile. This utility wraps
 * {@link com.arcusys.learn.persistence.liferay.service.impl.LFTincanActProfileLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see LFTincanActProfileLocalService
 * @see com.arcusys.learn.persistence.liferay.service.base.LFTincanActProfileLocalServiceBaseImpl
 * @see com.arcusys.learn.persistence.liferay.service.impl.LFTincanActProfileLocalServiceImpl
 * @generated
 */
public class LFTincanActProfileLocalServiceUtil {
    private static LFTincanActProfileLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.arcusys.learn.persistence.liferay.service.impl.LFTincanActProfileLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the l f tincan act profile to the database. Also notifies the appropriate model listeners.
    *
    * @param lfTincanActProfile the l f tincan act profile
    * @return the l f tincan act profile that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanActProfile addLFTincanActProfile(
        com.arcusys.learn.persistence.liferay.model.LFTincanActProfile lfTincanActProfile)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addLFTincanActProfile(lfTincanActProfile);
    }

    /**
    * Creates a new l f tincan act profile with the primary key. Does not add the l f tincan act profile to the database.
    *
    * @param id the primary key for the new l f tincan act profile
    * @return the new l f tincan act profile
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanActProfile createLFTincanActProfile(
        long id) {
        return getService().createLFTincanActProfile(id);
    }

    /**
    * Deletes the l f tincan act profile with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the l f tincan act profile
    * @return the l f tincan act profile that was removed
    * @throws PortalException if a l f tincan act profile with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanActProfile deleteLFTincanActProfile(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteLFTincanActProfile(id);
    }

    /**
    * Deletes the l f tincan act profile from the database. Also notifies the appropriate model listeners.
    *
    * @param lfTincanActProfile the l f tincan act profile
    * @return the l f tincan act profile that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanActProfile deleteLFTincanActProfile(
        com.arcusys.learn.persistence.liferay.model.LFTincanActProfile lfTincanActProfile)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteLFTincanActProfile(lfTincanActProfile);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanActProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanActProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.arcusys.learn.persistence.liferay.model.LFTincanActProfile fetchLFTincanActProfile(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchLFTincanActProfile(id);
    }

    /**
    * Returns the l f tincan act profile with the primary key.
    *
    * @param id the primary key of the l f tincan act profile
    * @return the l f tincan act profile
    * @throws PortalException if a l f tincan act profile with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanActProfile getLFTincanActProfile(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getLFTincanActProfile(id);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the l f tincan act profiles.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanActProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of l f tincan act profiles
    * @param end the upper bound of the range of l f tincan act profiles (not inclusive)
    * @return the range of l f tincan act profiles
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanActProfile> getLFTincanActProfiles(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getLFTincanActProfiles(start, end);
    }

    /**
    * Returns the number of l f tincan act profiles.
    *
    * @return the number of l f tincan act profiles
    * @throws SystemException if a system exception occurred
    */
    public static int getLFTincanActProfilesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getLFTincanActProfilesCount();
    }

    /**
    * Updates the l f tincan act profile in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param lfTincanActProfile the l f tincan act profile
    * @return the l f tincan act profile that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanActProfile updateLFTincanActProfile(
        com.arcusys.learn.persistence.liferay.model.LFTincanActProfile lfTincanActProfile)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateLFTincanActProfile(lfTincanActProfile);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static com.arcusys.learn.persistence.liferay.model.LFTincanActProfile findByActivityIdAndProfileId(
        java.lang.String activityId, java.lang.String profileId)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanActProfileException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().findByActivityIdAndProfileId(activityId, profileId);
    }

    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanActProfile> findByActivityId(
        java.lang.String activityId)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanActProfileException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().findByActivityId(activityId);
    }

    public static com.arcusys.learn.persistence.liferay.model.LFTincanActProfile createLFTincanLrsActivityProfile(
        java.lang.String activityId, java.lang.String profileId,
        java.lang.Integer documentId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .createLFTincanLrsActivityProfile(activityId, profileId,
            documentId);
    }

    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().removeAll();
    }

    public static void clearService() {
        _service = null;
    }

    public static LFTincanActProfileLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    LFTincanActProfileLocalService.class.getName());

            if (invokableLocalService instanceof LFTincanActProfileLocalService) {
                _service = (LFTincanActProfileLocalService) invokableLocalService;
            } else {
                _service = new LFTincanActProfileLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(LFTincanActProfileLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(LFTincanActProfileLocalService service) {
    }
}
