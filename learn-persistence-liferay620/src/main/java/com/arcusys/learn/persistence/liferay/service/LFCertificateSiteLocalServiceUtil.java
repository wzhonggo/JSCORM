package com.arcusys.learn.persistence.liferay.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for LFCertificateSite. This utility wraps
 * {@link com.arcusys.learn.persistence.liferay.service.impl.LFCertificateSiteLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see LFCertificateSiteLocalService
 * @see com.arcusys.learn.persistence.liferay.service.base.LFCertificateSiteLocalServiceBaseImpl
 * @see com.arcusys.learn.persistence.liferay.service.impl.LFCertificateSiteLocalServiceImpl
 * @generated
 */
public class LFCertificateSiteLocalServiceUtil {
    private static LFCertificateSiteLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.arcusys.learn.persistence.liferay.service.impl.LFCertificateSiteLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the l f certificate site to the database. Also notifies the appropriate model listeners.
    *
    * @param lfCertificateSite the l f certificate site
    * @return the l f certificate site that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFCertificateSite addLFCertificateSite(
        com.arcusys.learn.persistence.liferay.model.LFCertificateSite lfCertificateSite)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addLFCertificateSite(lfCertificateSite);
    }

    /**
    * Creates a new l f certificate site with the primary key. Does not add the l f certificate site to the database.
    *
    * @param id the primary key for the new l f certificate site
    * @return the new l f certificate site
    */
    public static com.arcusys.learn.persistence.liferay.model.LFCertificateSite createLFCertificateSite(
        long id) {
        return getService().createLFCertificateSite(id);
    }

    /**
    * Deletes the l f certificate site with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the l f certificate site
    * @return the l f certificate site that was removed
    * @throws PortalException if a l f certificate site with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFCertificateSite deleteLFCertificateSite(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteLFCertificateSite(id);
    }

    /**
    * Deletes the l f certificate site from the database. Also notifies the appropriate model listeners.
    *
    * @param lfCertificateSite the l f certificate site
    * @return the l f certificate site that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFCertificateSite deleteLFCertificateSite(
        com.arcusys.learn.persistence.liferay.model.LFCertificateSite lfCertificateSite)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteLFCertificateSite(lfCertificateSite);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFCertificateSiteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFCertificateSiteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.arcusys.learn.persistence.liferay.model.LFCertificateSite fetchLFCertificateSite(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchLFCertificateSite(id);
    }

    /**
    * Returns the l f certificate site with the primary key.
    *
    * @param id the primary key of the l f certificate site
    * @return the l f certificate site
    * @throws PortalException if a l f certificate site with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFCertificateSite getLFCertificateSite(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getLFCertificateSite(id);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the l f certificate sites.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFCertificateSiteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of l f certificate sites
    * @param end the upper bound of the range of l f certificate sites (not inclusive)
    * @return the range of l f certificate sites
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFCertificateSite> getLFCertificateSites(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getLFCertificateSites(start, end);
    }

    /**
    * Returns the number of l f certificate sites.
    *
    * @return the number of l f certificate sites
    * @throws SystemException if a system exception occurred
    */
    public static int getLFCertificateSitesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getLFCertificateSitesCount();
    }

    /**
    * Updates the l f certificate site in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param lfCertificateSite the l f certificate site
    * @return the l f certificate site that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFCertificateSite updateLFCertificateSite(
        com.arcusys.learn.persistence.liferay.model.LFCertificateSite lfCertificateSite)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateLFCertificateSite(lfCertificateSite);
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

    public static com.arcusys.learn.persistence.liferay.model.LFCertificateSite createLFCertificateSite()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().createLFCertificateSite();
    }

    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFCertificateSite> findByCertificateID(
        java.lang.Integer certificateID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findByCertificateID(certificateID);
    }

    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFCertificateSite> findByCertificateIDAndSiteID(
        java.lang.Integer certificateID, java.lang.Integer siteID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findByCertificateIDAndSiteID(certificateID, siteID);
    }

    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFCertificateSite> findByCertificateIDAndSiteID(
        java.lang.Integer[] certificateID, java.lang.Integer siteID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findByCertificateIDAndSiteID(certificateID, siteID);
    }

    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().removeAll();
    }

    public static void clearService() {
        _service = null;
    }

    public static LFCertificateSiteLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    LFCertificateSiteLocalService.class.getName());

            if (invokableLocalService instanceof LFCertificateSiteLocalService) {
                _service = (LFCertificateSiteLocalService) invokableLocalService;
            } else {
                _service = new LFCertificateSiteLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(LFCertificateSiteLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(LFCertificateSiteLocalService service) {
    }
}
