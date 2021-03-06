package com.arcusys.learn.persistence.liferay.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LFPackageVoteLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LFPackageVoteLocalService
 * @generated
 */
public class LFPackageVoteLocalServiceWrapper
    implements LFPackageVoteLocalService,
        ServiceWrapper<LFPackageVoteLocalService> {
    private LFPackageVoteLocalService _lfPackageVoteLocalService;

    public LFPackageVoteLocalServiceWrapper(
        LFPackageVoteLocalService lfPackageVoteLocalService) {
        _lfPackageVoteLocalService = lfPackageVoteLocalService;
    }

    /**
    * Adds the l f package vote to the database. Also notifies the appropriate model listeners.
    *
    * @param lfPackageVote the l f package vote
    * @return the l f package vote that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arcusys.learn.persistence.liferay.model.LFPackageVote addLFPackageVote(
        com.arcusys.learn.persistence.liferay.model.LFPackageVote lfPackageVote)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageVoteLocalService.addLFPackageVote(lfPackageVote);
    }

    /**
    * Creates a new l f package vote with the primary key. Does not add the l f package vote to the database.
    *
    * @param id the primary key for the new l f package vote
    * @return the new l f package vote
    */
    @Override
    public com.arcusys.learn.persistence.liferay.model.LFPackageVote createLFPackageVote(
        long id) {
        return _lfPackageVoteLocalService.createLFPackageVote(id);
    }

    /**
    * Deletes the l f package vote with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the l f package vote
    * @return the l f package vote that was removed
    * @throws PortalException if a l f package vote with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arcusys.learn.persistence.liferay.model.LFPackageVote deleteLFPackageVote(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageVoteLocalService.deleteLFPackageVote(id);
    }

    /**
    * Deletes the l f package vote from the database. Also notifies the appropriate model listeners.
    *
    * @param lfPackageVote the l f package vote
    * @return the l f package vote that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arcusys.learn.persistence.liferay.model.LFPackageVote deleteLFPackageVote(
        com.arcusys.learn.persistence.liferay.model.LFPackageVote lfPackageVote)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageVoteLocalService.deleteLFPackageVote(lfPackageVote);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _lfPackageVoteLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageVoteLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFPackageVoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageVoteLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFPackageVoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageVoteLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageVoteLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageVoteLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.arcusys.learn.persistence.liferay.model.LFPackageVote fetchLFPackageVote(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageVoteLocalService.fetchLFPackageVote(id);
    }

    /**
    * Returns the l f package vote with the primary key.
    *
    * @param id the primary key of the l f package vote
    * @return the l f package vote
    * @throws PortalException if a l f package vote with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arcusys.learn.persistence.liferay.model.LFPackageVote getLFPackageVote(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageVoteLocalService.getLFPackageVote(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageVoteLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the l f package votes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFPackageVoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of l f package votes
    * @param end the upper bound of the range of l f package votes (not inclusive)
    * @return the range of l f package votes
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFPackageVote> getLFPackageVotes(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageVoteLocalService.getLFPackageVotes(start, end);
    }

    /**
    * Returns the number of l f package votes.
    *
    * @return the number of l f package votes
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getLFPackageVotesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageVoteLocalService.getLFPackageVotesCount();
    }

    /**
    * Updates the l f package vote in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param lfPackageVote the l f package vote
    * @return the l f package vote that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.arcusys.learn.persistence.liferay.model.LFPackageVote updateLFPackageVote(
        com.arcusys.learn.persistence.liferay.model.LFPackageVote lfPackageVote)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageVoteLocalService.updateLFPackageVote(lfPackageVote);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _lfPackageVoteLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _lfPackageVoteLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _lfPackageVoteLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public com.arcusys.learn.persistence.liferay.model.LFPackageVote createLFPackageVote()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageVoteLocalService.createLFPackageVote();
    }

    @Override
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFPackageVote> findBySocialPackageID(
        java.lang.Integer packageID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPackageVoteLocalService.findBySocialPackageID(packageID);
    }

    @Override
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        _lfPackageVoteLocalService.removeAll();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public LFPackageVoteLocalService getWrappedLFPackageVoteLocalService() {
        return _lfPackageVoteLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedLFPackageVoteLocalService(
        LFPackageVoteLocalService lfPackageVoteLocalService) {
        _lfPackageVoteLocalService = lfPackageVoteLocalService;
    }

    @Override
    public LFPackageVoteLocalService getWrappedService() {
        return _lfPackageVoteLocalService;
    }

    @Override
    public void setWrappedService(
        LFPackageVoteLocalService lfPackageVoteLocalService) {
        _lfPackageVoteLocalService = lfPackageVoteLocalService;
    }
}
