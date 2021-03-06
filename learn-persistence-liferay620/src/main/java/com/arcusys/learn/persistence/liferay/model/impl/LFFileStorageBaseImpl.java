package com.arcusys.learn.persistence.liferay.model.impl;

import com.arcusys.learn.persistence.liferay.model.LFFileStorage;
import com.arcusys.learn.persistence.liferay.service.LFFileStorageLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the LFFileStorage service. Represents a row in the &quot;Learn_LFFileStorage&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LFFileStorageImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFFileStorageImpl
 * @see com.arcusys.learn.persistence.liferay.model.LFFileStorage
 * @generated
 */
public abstract class LFFileStorageBaseImpl extends LFFileStorageModelImpl
    implements LFFileStorage {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a l f file storage model instance should use the {@link LFFileStorage} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            LFFileStorageLocalServiceUtil.addLFFileStorage(this);
        } else {
            LFFileStorageLocalServiceUtil.updateLFFileStorage(this);
        }
    }
}
