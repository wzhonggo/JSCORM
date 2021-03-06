package com.arcusys.learn.persistence.liferay.model.impl;

import com.arcusys.learn.persistence.liferay.model.LFTincanActivity;
import com.arcusys.learn.persistence.liferay.model.LFTincanActivityModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
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
 * The base model implementation for the LFTincanActivity service. Represents a row in the &quot;Learn_LFTincanActivity&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.arcusys.learn.persistence.liferay.model.LFTincanActivityModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LFTincanActivityImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFTincanActivityImpl
 * @see com.arcusys.learn.persistence.liferay.model.LFTincanActivity
 * @see com.arcusys.learn.persistence.liferay.model.LFTincanActivityModel
 * @generated
 */
public class LFTincanActivityModelImpl extends BaseModelImpl<LFTincanActivity>
    implements LFTincanActivityModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a l f tincan activity model instance should use the {@link com.arcusys.learn.persistence.liferay.model.LFTincanActivity} interface instead.
     */
    public static final String TABLE_NAME = "Learn_LFTincanActivity";
    public static final Object[][] TABLE_COLUMNS = {
            { "id_", Types.BIGINT },
            { "tincanID", Types.VARCHAR },
            { "packageID", Types.BIGINT },
            { "objectType", Types.VARCHAR },
            { "name", Types.CLOB },
            { "description", Types.CLOB },
            { "theType", Types.CLOB },
            { "moreInfo", Types.CLOB },
            { "interactionType", Types.CLOB },
            { "correctResponsesPattern", Types.CLOB },
            { "choices", Types.CLOB },
            { "scale", Types.CLOB },
            { "source", Types.CLOB },
            { "target", Types.CLOB },
            { "steps", Types.CLOB },
            { "extensions", Types.CLOB }
        };
    public static final String TABLE_SQL_CREATE = "create table Learn_LFTincanActivity (id_ LONG not null primary key,tincanID VARCHAR(2000) null,packageID LONG null,objectType VARCHAR(75) null,name TEXT null,description TEXT null,theType TEXT null,moreInfo TEXT null,interactionType TEXT null,correctResponsesPattern TEXT null,choices TEXT null,scale TEXT null,source TEXT null,target TEXT null,steps TEXT null,extensions TEXT null)";
    public static final String TABLE_SQL_DROP = "drop table Learn_LFTincanActivity";
    public static final String ORDER_BY_JPQL = " ORDER BY lfTincanActivity.id ASC";
    public static final String ORDER_BY_SQL = " ORDER BY Learn_LFTincanActivity.id_ ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFTincanActivity"),
            false);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFTincanActivity"),
            false);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.arcusys.learn.persistence.liferay.model.LFTincanActivity"),
            true);
    public static long PACKAGEID_COLUMN_BITMASK = 1L;
    public static long TINCANID_COLUMN_BITMASK = 2L;
    public static long ID_COLUMN_BITMASK = 4L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.arcusys.learn.persistence.liferay.model.LFTincanActivity"));
    private static ClassLoader _classLoader = LFTincanActivity.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            LFTincanActivity.class
        };
    private long _id;
    private String _tincanID;
    private String _originalTincanID;
    private Long _packageID;
    private Long _originalPackageID;
    private boolean _setOriginalPackageID;
    private String _objectType;
    private String _name;
    private String _description;
    private String _theType;
    private String _moreInfo;
    private String _interactionType;
    private String _correctResponsesPattern;
    private String _choices;
    private String _scale;
    private String _source;
    private String _target;
    private String _steps;
    private String _extensions;
    private long _columnBitmask;
    private LFTincanActivity _escapedModel;

    public LFTincanActivityModelImpl() {
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
        return LFTincanActivity.class;
    }

    @Override
    public String getModelClassName() {
        return LFTincanActivity.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("tincanID", getTincanID());
        attributes.put("packageID", getPackageID());
        attributes.put("objectType", getObjectType());
        attributes.put("name", getName());
        attributes.put("description", getDescription());
        attributes.put("theType", getTheType());
        attributes.put("moreInfo", getMoreInfo());
        attributes.put("interactionType", getInteractionType());
        attributes.put("correctResponsesPattern", getCorrectResponsesPattern());
        attributes.put("choices", getChoices());
        attributes.put("scale", getScale());
        attributes.put("source", getSource());
        attributes.put("target", getTarget());
        attributes.put("steps", getSteps());
        attributes.put("extensions", getExtensions());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String tincanID = (String) attributes.get("tincanID");

        if (tincanID != null) {
            setTincanID(tincanID);
        }

        Long packageID = (Long) attributes.get("packageID");

        if (packageID != null) {
            setPackageID(packageID);
        }

        String objectType = (String) attributes.get("objectType");

        if (objectType != null) {
            setObjectType(objectType);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }

        String theType = (String) attributes.get("theType");

        if (theType != null) {
            setTheType(theType);
        }

        String moreInfo = (String) attributes.get("moreInfo");

        if (moreInfo != null) {
            setMoreInfo(moreInfo);
        }

        String interactionType = (String) attributes.get("interactionType");

        if (interactionType != null) {
            setInteractionType(interactionType);
        }

        String correctResponsesPattern = (String) attributes.get(
                "correctResponsesPattern");

        if (correctResponsesPattern != null) {
            setCorrectResponsesPattern(correctResponsesPattern);
        }

        String choices = (String) attributes.get("choices");

        if (choices != null) {
            setChoices(choices);
        }

        String scale = (String) attributes.get("scale");

        if (scale != null) {
            setScale(scale);
        }

        String source = (String) attributes.get("source");

        if (source != null) {
            setSource(source);
        }

        String target = (String) attributes.get("target");

        if (target != null) {
            setTarget(target);
        }

        String steps = (String) attributes.get("steps");

        if (steps != null) {
            setSteps(steps);
        }

        String extensions = (String) attributes.get("extensions");

        if (extensions != null) {
            setExtensions(extensions);
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
    public String getTincanID() {
        return _tincanID;
    }

    @Override
    public void setTincanID(String tincanID) {
        _columnBitmask |= TINCANID_COLUMN_BITMASK;

        if (_originalTincanID == null) {
            _originalTincanID = _tincanID;
        }

        _tincanID = tincanID;
    }

    public String getOriginalTincanID() {
        return _originalTincanID;
    }

    @Override
    public Long getPackageID() {
        return _packageID;
    }

    @Override
    public void setPackageID(Long packageID) {
        _columnBitmask |= PACKAGEID_COLUMN_BITMASK;

        if (!_setOriginalPackageID) {
            _setOriginalPackageID = true;

            _originalPackageID = _packageID;
        }

        _packageID = packageID;
    }

    public Long getOriginalPackageID() {
        return _originalPackageID;
    }

    @Override
    public String getObjectType() {
        return _objectType;
    }

    @Override
    public void setObjectType(String objectType) {
        _objectType = objectType;
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;
    }

    @Override
    public String getDescription() {
        return _description;
    }

    @Override
    public void setDescription(String description) {
        _description = description;
    }

    @Override
    public String getTheType() {
        return _theType;
    }

    @Override
    public void setTheType(String theType) {
        _theType = theType;
    }

    @Override
    public String getMoreInfo() {
        return _moreInfo;
    }

    @Override
    public void setMoreInfo(String moreInfo) {
        _moreInfo = moreInfo;
    }

    @Override
    public String getInteractionType() {
        return _interactionType;
    }

    @Override
    public void setInteractionType(String interactionType) {
        _interactionType = interactionType;
    }

    @Override
    public String getCorrectResponsesPattern() {
        return _correctResponsesPattern;
    }

    @Override
    public void setCorrectResponsesPattern(String correctResponsesPattern) {
        _correctResponsesPattern = correctResponsesPattern;
    }

    @Override
    public String getChoices() {
        return _choices;
    }

    @Override
    public void setChoices(String choices) {
        _choices = choices;
    }

    @Override
    public String getScale() {
        return _scale;
    }

    @Override
    public void setScale(String scale) {
        _scale = scale;
    }

    @Override
    public String getSource() {
        return _source;
    }

    @Override
    public void setSource(String source) {
        _source = source;
    }

    @Override
    public String getTarget() {
        return _target;
    }

    @Override
    public void setTarget(String target) {
        _target = target;
    }

    @Override
    public String getSteps() {
        return _steps;
    }

    @Override
    public void setSteps(String steps) {
        _steps = steps;
    }

    @Override
    public String getExtensions() {
        return _extensions;
    }

    @Override
    public void setExtensions(String extensions) {
        _extensions = extensions;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            LFTincanActivity.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public LFTincanActivity toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (LFTincanActivity) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        LFTincanActivityImpl lfTincanActivityImpl = new LFTincanActivityImpl();

        lfTincanActivityImpl.setId(getId());
        lfTincanActivityImpl.setTincanID(getTincanID());
        lfTincanActivityImpl.setPackageID(getPackageID());
        lfTincanActivityImpl.setObjectType(getObjectType());
        lfTincanActivityImpl.setName(getName());
        lfTincanActivityImpl.setDescription(getDescription());
        lfTincanActivityImpl.setTheType(getTheType());
        lfTincanActivityImpl.setMoreInfo(getMoreInfo());
        lfTincanActivityImpl.setInteractionType(getInteractionType());
        lfTincanActivityImpl.setCorrectResponsesPattern(getCorrectResponsesPattern());
        lfTincanActivityImpl.setChoices(getChoices());
        lfTincanActivityImpl.setScale(getScale());
        lfTincanActivityImpl.setSource(getSource());
        lfTincanActivityImpl.setTarget(getTarget());
        lfTincanActivityImpl.setSteps(getSteps());
        lfTincanActivityImpl.setExtensions(getExtensions());

        lfTincanActivityImpl.resetOriginalValues();

        return lfTincanActivityImpl;
    }

    @Override
    public int compareTo(LFTincanActivity lfTincanActivity) {
        long primaryKey = lfTincanActivity.getPrimaryKey();

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

        if (!(obj instanceof LFTincanActivity)) {
            return false;
        }

        LFTincanActivity lfTincanActivity = (LFTincanActivity) obj;

        long primaryKey = lfTincanActivity.getPrimaryKey();

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
        LFTincanActivityModelImpl lfTincanActivityModelImpl = this;

        lfTincanActivityModelImpl._originalTincanID = lfTincanActivityModelImpl._tincanID;

        lfTincanActivityModelImpl._originalPackageID = lfTincanActivityModelImpl._packageID;

        lfTincanActivityModelImpl._setOriginalPackageID = false;

        lfTincanActivityModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<LFTincanActivity> toCacheModel() {
        LFTincanActivityCacheModel lfTincanActivityCacheModel = new LFTincanActivityCacheModel();

        lfTincanActivityCacheModel.id = getId();

        lfTincanActivityCacheModel.tincanID = getTincanID();

        String tincanID = lfTincanActivityCacheModel.tincanID;

        if ((tincanID != null) && (tincanID.length() == 0)) {
            lfTincanActivityCacheModel.tincanID = null;
        }

        lfTincanActivityCacheModel.packageID = getPackageID();

        lfTincanActivityCacheModel.objectType = getObjectType();

        String objectType = lfTincanActivityCacheModel.objectType;

        if ((objectType != null) && (objectType.length() == 0)) {
            lfTincanActivityCacheModel.objectType = null;
        }

        lfTincanActivityCacheModel.name = getName();

        String name = lfTincanActivityCacheModel.name;

        if ((name != null) && (name.length() == 0)) {
            lfTincanActivityCacheModel.name = null;
        }

        lfTincanActivityCacheModel.description = getDescription();

        String description = lfTincanActivityCacheModel.description;

        if ((description != null) && (description.length() == 0)) {
            lfTincanActivityCacheModel.description = null;
        }

        lfTincanActivityCacheModel.theType = getTheType();

        String theType = lfTincanActivityCacheModel.theType;

        if ((theType != null) && (theType.length() == 0)) {
            lfTincanActivityCacheModel.theType = null;
        }

        lfTincanActivityCacheModel.moreInfo = getMoreInfo();

        String moreInfo = lfTincanActivityCacheModel.moreInfo;

        if ((moreInfo != null) && (moreInfo.length() == 0)) {
            lfTincanActivityCacheModel.moreInfo = null;
        }

        lfTincanActivityCacheModel.interactionType = getInteractionType();

        String interactionType = lfTincanActivityCacheModel.interactionType;

        if ((interactionType != null) && (interactionType.length() == 0)) {
            lfTincanActivityCacheModel.interactionType = null;
        }

        lfTincanActivityCacheModel.correctResponsesPattern = getCorrectResponsesPattern();

        String correctResponsesPattern = lfTincanActivityCacheModel.correctResponsesPattern;

        if ((correctResponsesPattern != null) &&
                (correctResponsesPattern.length() == 0)) {
            lfTincanActivityCacheModel.correctResponsesPattern = null;
        }

        lfTincanActivityCacheModel.choices = getChoices();

        String choices = lfTincanActivityCacheModel.choices;

        if ((choices != null) && (choices.length() == 0)) {
            lfTincanActivityCacheModel.choices = null;
        }

        lfTincanActivityCacheModel.scale = getScale();

        String scale = lfTincanActivityCacheModel.scale;

        if ((scale != null) && (scale.length() == 0)) {
            lfTincanActivityCacheModel.scale = null;
        }

        lfTincanActivityCacheModel.source = getSource();

        String source = lfTincanActivityCacheModel.source;

        if ((source != null) && (source.length() == 0)) {
            lfTincanActivityCacheModel.source = null;
        }

        lfTincanActivityCacheModel.target = getTarget();

        String target = lfTincanActivityCacheModel.target;

        if ((target != null) && (target.length() == 0)) {
            lfTincanActivityCacheModel.target = null;
        }

        lfTincanActivityCacheModel.steps = getSteps();

        String steps = lfTincanActivityCacheModel.steps;

        if ((steps != null) && (steps.length() == 0)) {
            lfTincanActivityCacheModel.steps = null;
        }

        lfTincanActivityCacheModel.extensions = getExtensions();

        String extensions = lfTincanActivityCacheModel.extensions;

        if ((extensions != null) && (extensions.length() == 0)) {
            lfTincanActivityCacheModel.extensions = null;
        }

        return lfTincanActivityCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(33);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", tincanID=");
        sb.append(getTincanID());
        sb.append(", packageID=");
        sb.append(getPackageID());
        sb.append(", objectType=");
        sb.append(getObjectType());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append(", theType=");
        sb.append(getTheType());
        sb.append(", moreInfo=");
        sb.append(getMoreInfo());
        sb.append(", interactionType=");
        sb.append(getInteractionType());
        sb.append(", correctResponsesPattern=");
        sb.append(getCorrectResponsesPattern());
        sb.append(", choices=");
        sb.append(getChoices());
        sb.append(", scale=");
        sb.append(getScale());
        sb.append(", source=");
        sb.append(getSource());
        sb.append(", target=");
        sb.append(getTarget());
        sb.append(", steps=");
        sb.append(getSteps());
        sb.append(", extensions=");
        sb.append(getExtensions());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(52);

        sb.append("<model><model-name>");
        sb.append(
            "com.arcusys.learn.persistence.liferay.model.LFTincanActivity");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tincanID</column-name><column-value><![CDATA[");
        sb.append(getTincanID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>packageID</column-name><column-value><![CDATA[");
        sb.append(getPackageID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>objectType</column-name><column-value><![CDATA[");
        sb.append(getObjectType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description</column-name><column-value><![CDATA[");
        sb.append(getDescription());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>theType</column-name><column-value><![CDATA[");
        sb.append(getTheType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>moreInfo</column-name><column-value><![CDATA[");
        sb.append(getMoreInfo());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>interactionType</column-name><column-value><![CDATA[");
        sb.append(getInteractionType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>correctResponsesPattern</column-name><column-value><![CDATA[");
        sb.append(getCorrectResponsesPattern());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>choices</column-name><column-value><![CDATA[");
        sb.append(getChoices());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>scale</column-name><column-value><![CDATA[");
        sb.append(getScale());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>source</column-name><column-value><![CDATA[");
        sb.append(getSource());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>target</column-name><column-value><![CDATA[");
        sb.append(getTarget());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>steps</column-name><column-value><![CDATA[");
        sb.append(getSteps());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>extensions</column-name><column-value><![CDATA[");
        sb.append(getExtensions());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
