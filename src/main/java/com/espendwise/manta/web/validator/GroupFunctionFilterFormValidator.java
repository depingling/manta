package com.espendwise.manta.web.validator;

import com.espendwise.manta.util.Constants;
import com.espendwise.manta.util.Utility;
import com.espendwise.manta.util.validation.*;
import com.espendwise.manta.web.forms.GroupFunctionFilterForm;
import com.espendwise.manta.web.resolver.TextErrorWebResolver;
import com.espendwise.manta.web.util.WebErrors;


public class GroupFunctionFilterFormValidator extends AbstractFormValidator {

    public GroupFunctionFilterFormValidator() {
        super();
    }

    @Override
    public ValidationResult validate(Object obj) {

    	GroupFunctionFilterForm form = (GroupFunctionFilterForm) obj;

        WebErrors errors = new WebErrors();

        if (Utility.isSet(form.getFunctionName())) {
            TextValidator validator = Validators.getTextValidator(Constants.VALIDATION_FIELD_CRITERIA.SHORT_DESC_LENGTH);
            CodeValidationResult vr = validator.validate(form.getFunctionName(), new TextErrorWebResolver("admin.message.label.name", null));
            if (vr != null) {
                errors.putErrors(vr.getResult());
            }
        }

        return new MessageValidationResult(errors.get());

    }
}