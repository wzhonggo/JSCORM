package com.arcusys.learn.persistence.liferay.model.impl;

import com.arcusys.learn.persistence.liferay.model.LFPackage;
import com.arcusys.learn.persistence.liferay.model.LFPackageModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the LFPackage service. Represents a row in the &quot;Learn_LFPackage&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.arcusys.learn.persistence.liferay.model.LFPackageModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LFPackageImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFPackageImpl
 * @see com.arcusys.learn.persistence.liferay.model.LFPackage
 * @see com.arcusys.learn.persistence.liferay.model.LFPackageModel
 * @generated
 */
public class LFPackageModelImpl extends BaseModelImpl<LFPackage>
    implements LFPackageModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a l f package model instance should use the {@link com.arcusys.learn.persistence.liferay.model.LFPackage} interface instead.
     */
    public static final String TABLE_NAME = "Learn_LFPackage";
    public static final Object[][] TABLE_COLUMNS = {
            { "id_", Types.BIGINT },
            { "defaultOrganizationID", Types.CLOB },
            { "title", Types.CLOB },
            { "base", Types.CLOB },
            { "resourcesBase", Types.CLOB },
            { "summary", Types.CLOB },
            { "assetRefID", Types.BIGINT },
            { "courseID", Types.INTEGER }
        };
    public static final String TABLE_SQL_CREATE = "create table Learn_LFPackage (id_ LONG not null primary key,defaultOrganizationID TEXT null,title TEXT null,base TEXT null,resourcesBase TEXT null,summary TEXT null,assetRefID LONG null,courseID INTEGER null)";
    public static final String TABLE_SQL_DROP = "drop table Learn_LFPackage";
    public static final String ORDER_BY_JPQL = " ORDER BY lfPackage.id ASC";
    public static final String ORDER_BY_SQL = " ORDER BY Learn_LFPackage.id_ ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFPackage"),
            false);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFPackage"),
            false);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.arcusys.learn.persistence.liferay.model.LFPackage"),
            true);
    public static long ASSETREFID_COLUMN_BITMASK = 1L;
    public static long COURSEID_COLUMN_BITMASK = 2L;
    public static long ID_COLUMN_BITMASK = 4L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.arcusys.learn.persistence.liferay.model.LFPackage"));
    private static ClassLoader _classLoader = LFPackage.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            LFPackage.class
        };
    private long _id;
    private String _defaultOrganizationID;
    private String _title;
    private String _base;
    private String _resourcesBase;
    private String _summary;
    private Long _assetRefID;
    private Long _originalAssetRefID;
    private boolean _setOriginalAssetRefID;
    private Integer _courseID;
    private Integer _originalCourseID;
    private boolean _setOriginalCourseID;
    private long _columnBitmask;
    private LFPackage _escapedModel;

    public LFPackageModelImpl() {
    }

    @Override
    public long getPrimaryKey() {
        return _id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return LFPackage.class;
    }

    @Override
    public String getModelClassName() {
        return LFPackage.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("defaultOrganizationID", getDefaultOrganizationID());
        attributes.put("title", getTitle());
        attributes.put("base", getBase());
        attributes.put("resourcesBase", getResourcesBase());
        attributes.put("summary", getSummary());
        attributes.put("assetRefID", getAssetRefID());
        attributes.put("courseID", getCourseID());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String defaultOrganizationID = (String) attributes.get(
                "defaultOrganizationID");

        if (defaultOrganizationID != null) {
            setDefaultOrganizationID(defaultOrganizationID);
        }

        String title = (String) attributes.get("title");

        if (title != null) {
            setTitle(title);
        }

        String base = (String) attributes.get("base");

        if (base != null) {
            setBase(base);
        }

        String resourcesBase = (String) attributes.get("resourcesBase");

        if (resourcesBase != null) {
            setResourcesBase(resourcesBase);
        }

        String summary = (String) attributes.get("summary");

        if (summary != null) {
            setSummary(summary);
        }

        Long assetRefID = (Long) attributes.get("assetRefID");

        if (assetRefID != null) {
            setAssetRefID(assetRefID);
        }

        Integer courseID = (Integer) attributes.get("courseID");

        if (courseID != null) {
            setCourseID(courseID);
        }
    }

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;
    }

    @Override
    public String getDefaultOrganizationID() {
        return _defaultOrganizationID;
    }

    @Override
    public void setDefaultOrganizationID(String defaultOrganizationID) {
        _defaultOrganizationID = defaultOrganizationID;
    }

    @Override
    public String getTitle() {
        if (_title == null) {
            return StringPool.BLANK;
        } else {
            return _title;
        }
    }

    @Override
    public void setTitle(String title) {
        _title = title;
    }

    @Override
    public String getBase() {
        return _base;
    }

    @Override
    public void setBase(String base) {
        _base = base;
    }

    @Override
    public String getResourcesBase() {
        return _resourcesBase;
    }

    @Override
    public void setResourcesBase(String resourcesBase) {
        _resourcesBase = resourcesBase;
    }

    @Override
    public String getSummary() {
        return _summary;
    }

    @Override
    public void setSummary(String summary) {
        _summary = summary;
    }

    @Override
    public Long getAssetRefID() {
        return _assetRefID;
    }

    @Override
    public void setAssetRefID(Long assetRefID) {
        _columnBitmask |= ASSETREFID_COLUMN_BITMASK;

        if (!_setOriginalAssetRefID) {
            _setOriginalAssetRefID = true;

            _originalAssetRefID = _assetRefID;
        }

        _assetRefID = assetRefID;
    }

    public Long getOriginalAssetRefID() {
        return _originalAssetRefID;
    }

    @Override
    public Integer getCourseID() {
        return _courseID;
    }

    @Override
    public void setCourseID(Integer courseID) {
        _columnBitmask |= COURSEID_COLUMN_BITMASK;

        if (!_setOriginalCourseID) {
            _setOriginalCourseID = true;

            _originalCourseID = _courseID;
        }

        _courseID = courseID;
    }

    public Integer getOriginalCourseID() {
        return _originalCourseID;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            LFPackage.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public LFPackage toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (LFPackage) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        LFPackageImpl lfPackageImpl = new LFPackageImpl();

        lfPackageImpl.setId(getId());
        lfPackageImpl.setDefaultOrganizationID(getDefaultOrganizationID());
        lfPackageImpl.setTitle(getTitle());
        lfPackageImpl.setBase(getBase());
        lfPackageImpl.setResourcesBase(getResourcesBase());
        lfPackageImpl.setSummary(getSummary());
        lfPackageImpl.setAssetRefID(getAssetRefID());
        lfPackageImpl.setCourseID(getCourseID());

        lfPackageImpl.resetOriginalValues();

        return lfPackageImpl;
    }

    @Override
    public int compareTo(LFPackage lfPackage) {
        long primaryKey = lfPackage.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LFPackage)) {
            return false;
        }

        LFPackage lfPackage = (LFPackage) obj;

        long primaryKey = lfPackage.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        LFPackageModelImpl lfPackageModelImpl = this;

        lfPackageModelImpl._originalAssetRefID = lfPackageModelImpl._assetRefID;

        lfPackageModelImpl._setOriginalAssetRefID = false;

        lfPackageModelImpl._originalCourseID = lfPackageModelImpl._courseID;

        lfPackageModelImpl._setOriginalCourseID = false;

        lfPackageModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<LFPackage> toCacheModel() {
        LFPackageCacheModel lfPackageCacheModel = new LFPackageCacheModel();

        lfPackageCacheModel.id = getId();

        lfPackageCacheModel.defaultOrganizationID = getDefaultOrganizationID();

        String defaultOrganizationID = lfPackageCacheModel.defaultOrganizationID;

        if ((defaultOrganizationID != null) &&
                (defaultOrganizationID.length() == 0)) {
            lfPackageCacheModel.defaultOrganizationID = null;
        }

        lfPackageCacheModel.title = getTitle();

        String title = lfPackageCacheModel.title;

        if ((title != null) && (title.length() == 0)) {
            lfPackageCacheModel.title = null;
        }

        lfPackageCacheModel.base = getBase();

        String base = lfPackageCacheModel.base;

        if ((base != null) && (base.length() == 0)) {
            lfPackageCacheModel.base = null;
        }

        lfPackageCacheModel.resourcesBase = getResourcesBase();

        String resourcesBase = lfPackageCacheModel.resourcesBase;

        if ((resourcesBase != null) && (resourcesBase.length() == 0)) {
            lfPackageCacheModel.resourcesBase = null;
        }

        lfPackageCacheModel.summary = getSummary();

        String summary = lfPackageCacheModel.summary;

        if ((summary != null) && (summary.length() == 0)) {
            lfPackageCacheModel.summary = null;
        }

        lfPackageCacheModel.assetRefID = getAssetRefID();

        lfPackageCacheModel.courseID = getCourseID();

        return lfPackageCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", defaultOrganizationID=");
        sb.append(getDefaultOrganizationID());
        sb.append(", title=");
        sb.append(getTitle());
        sb.append(", base=");
        sb.append(getBase());
        sb.append(", resourcesBase=");
        sb.append(getResourcesBase());
        sb.append(", summary=");
        sb.append(getSummary());
        sb.append(", assetRefID=");
        sb.append(getAssetRefID());
        sb.append(", courseID=");
        sb.append(getCourseID());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(28);

        sb.append("<model><model-name>");
        sb.append("com.arcusys.learn.persistence.liferay.model.LFPackage");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>defaultOrganizationID</column-name><column-value><![CDATA[");
        sb.append(getDefaultOrganizationID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>title</column-name><column-value><![CDATA[");
        sb.append(getTitle());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>base</column-name><column-value><![CDATA[");
        sb.append(getBase());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>resourcesBase</column-name><column-value><![CDATA[");
        sb.append(getResourcesBase());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>summary</column-name><column-value><![CDATA[");
        sb.append(getSummary());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>assetRefID</column-name><column-value><![CDATA[");
        sb.append(getAssetRefID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>courseID</column-name><column-value><![CDATA[");
        sb.append(getCourseID());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
