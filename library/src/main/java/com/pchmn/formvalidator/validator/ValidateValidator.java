package com.pchmn.formvalidator.validator;


public class ValidateValidator extends AbstractValidator {

    public ValidateValidator() {
    }

    @Override
    public boolean isValid(String value) {
        return true;
    }

    @Override
    public String getErrorMessage() {
        return mErrorMessage;
    }
}
