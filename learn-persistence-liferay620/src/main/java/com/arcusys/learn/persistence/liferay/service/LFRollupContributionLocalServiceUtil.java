package com.arcusys.learn.persistence.liferay.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for LFRollupContribution. This utility wraps
 * {@link com.arcusys.learn.persistence.liferay.service.impl.LFRollupContributionLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see LFRollupContributionLocalService
 * @see com.arcusys.learn.persistence.liferay.service.base.LFRollupContributionLocalServiceBaseImpl
 * @see com.arcusys.learn.persistence.liferay.service.impl.LFRollupContributionLocalServiceImpl
 * @generated
 */
public class LFRollupContributionLocalServiceUtil {
    private static LFRollupContributionLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.arcusys.learn.persistence.liferay.service.impl.LFRollupContributionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the l f rollup contribution to the database. Also notifies the appropriate model listeners.
    *
    * @param lfRollupContribution the l f rollup contribution
    * @return the l f rollup contribution that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFRollupContribution addLFRollupContribution(
        com.arcusys.learn.persistence.liferay.model.LFRollupContribution lfRollupContribution)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addLFRollupContribution(lfRollupContribution);
    }

    /**
    * Creates a new l f rollup contribution with the primary key. Does not add the l f rollup contribution to the database.
    *
    * @param id the primary key for the new l f rollup contribution
    * @return the new l f rollup contribution
    */
    public static com.arcusys.learn.persistence.liferay.model.LFRollupContribution createLFRollupContribution(
        long id) {
        return getService().createLFRollupContribution(id);
    }

    /**
    * Deletes the l f rollup contribution with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the l f rollup contribution
    * @return the l f rollup contribution that was removed
    * @throws PortalException if a l f rollup contribution with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFRollupContribution deleteLFRollupContribution(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteLFRollupContribution(id);
    }

    /**
    * Deletes the l f rollup contribution from the database. Also notifies the appropriate model listeners.
    *
    * @param lfRollupContribution the l f rollup contribution
    * @return the l f rollup contribution that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFRollupContribution deleteLFRollupContribution(
        com.arcusys.learn.persistence.liferay.model.LFRollupContribution lfRollupContribution)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteLFRollupContribution(lfRollupContribution);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFRollupContributionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFRollupContributionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.arcusys.learn.persistence.liferay.model.LFRollupContribution fetchLFRollupContribution(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchLFRollupContribution(id);
    }

    /**
    * Returns the l f rollup contribution with the primary key.
    *
    * @param id the primary key of the l f rollup contribution
    * @return the l f rollup contribution
    * @throws PortalException if a l f rollup contribution with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFRollupContribution getLFRollupContribution(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getLFRollupContribution(id);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the l f rollup contributions.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFRollupContributionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of l f rollup contributions
    * @param end the upper bound of the range of l f rollup contributions (not inclusive)
    * @return the range of l f rollup contributions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFRollupContribution> getLFRollupContributions(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getLFRollupContributions(start, end);
    }

    /**
    * Returns the number of l f rollup contributions.
    *
    * @return the number of l f rollup contributions
    * @throws SystemException if a system exception occurred
    */
    public static int getLFRollupContributionsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getLFRollupContributionsCount();
    }

    /**
    * Updates the l f rollup contribution in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param lfRollupContribution the l f rollup contribution
    * @return the l f rollup contribution that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFRollupContribution updateLFRollupContribution(
        com.arcusys.learn.persistence.liferay.model.LFRollupContribution lfRollupContribution)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateLFRollupContribution(lfRollupContribution);
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

    public static com.arcusys.learn.persistence.liferay.model.LFRollupContribution createLFRollupContribution()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().createLFRollupContribution();
    }

    public static com.arcusys.learn.persistence.liferay.model.LFRollupContribution findBySequencingID(
        java.lang.Integer sequencingID)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFRollupContributionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().findBySequencingID(sequencingID);
    }

    public static void removeBySequencingID(java.lang.Integer sequencingID)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFRollupContributionException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().removeBySequencingID(sequencingID);
    }

    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().removeAll();
    }

    public static void clearService() {
        _service = null;
    }

    public static LFRollupContributionLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    LFRollupContributionLocalService.class.getName());

            if (invokableLocalService instanceof LFRollupContributionLocalService) {
                _service = (LFRollupContributionLocalService) invokableLocalService;
            } else {
                _service = new LFRollupContributionLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(LFRollupContributionLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(LFRollupContributionLocalService service) {
    }
}
