package com.espendwise.manta.history;

import com.espendwise.manta.auth.Auth;
import com.espendwise.manta.i18n.I18nUtil;

public class ModifyUserHistoryRecord extends AbstractUserHistoryRecord {

	@Override
	public String getHistoryTypeCode() {
		return HistoryRecord.TYPE_CODE_MODIFY_USER;
	}

	@Override
	public String getShortDescription() {
		String objectType = I18nUtil.getMessage(Auth.getAppUser().getLocale(), "history.objectType.user");
		Object[] args = new Object[1];
		args[0] = objectType;
		return I18nUtil.getMessage(Auth.getAppUser().getLocale(), "history.type.modifyObject", args);
	}	
	
	@Override
	public String getLongDescription() {
		return buildLongDescription(false, "history.description.modifiedObject");
	}
	
	@Override
	public String getLongDescriptionAsHtml() {
		return buildLongDescription(true, "history.description.modifiedObject");
	}
}
