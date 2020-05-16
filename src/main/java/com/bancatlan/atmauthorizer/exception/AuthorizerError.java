package com.bancatlan.atmauthorizer.exception;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum AuthorizerError implements IError {
    /**
    * ESB SUFFIX MINTS ENTERPRISE SERVICE BUS
     * SERVICE SUFFIX TO BANK SERVICES
    * */
    OK(0,"Success"),
    MALFORMED_URL(1,"URL Malformed"),
    SERVICE_ERROR(2,"Service Error"),
    BINDING_ERROR(3,"Binding error"),
    REMOTE_ERROR(4,"Remote error"),
    LOGIN_ERROR(5,"Login into Entrust Failed"),
    ADMIN_LOGIN_ERROR(6,"Login into Entrust failed"),
    ADMIN_LOGOUT_ERROR(7,"LogOut failed!"),
    ADMIN_USER_LIST_ERROR(8,"Error when retrieving the user list"),
    ADMIN_CREATE_USER_ERROR(9,"Error when creating the user"),
    ADMIN_CREATE_SOFT_TOKEN_ERROR(10,"Error when creating the soft token"),
    ADMIN_ACTIVATE_SOFT_TOKEN_ERROR(11,"Error when activating soft token"),
    ADMIN_ACTIVATE_COMPLETE_SOFT_TOKEN_ERROR(12,"Error when completing the soft token activation"),
    DUPLICATE_USER_ERROR(13,"More than one user found with the same id, cannot continue"),
    ADMIN_CANCEL_TOKENS_ERROR(14,"An error ocurred while deleting the tokens"),
    EXTERNAL_USER_DATA_ERROR(15,"Error when recovering the user data"),
    EXTERNAL_SMS_ERROR(16,"Basa Custom error when tried sending the sms"),
    UNEXPECTED_ERROR(17,"Unexpected exception"),
    EXTERNAL_USER_DATA_NOT_FOUND_ERROR(18,"Data not defined for the user"),
    OK_NEEDS_VERIFICATION(19,"User has a token, needs verification. SMS sent"),
    ENCRYPT_ERROR(20,"Error when generating the encryption"),
    ENCRYPTED_CODE_ERROR(21,"The code is incorrect for this user"),
    FILE_NOT_FOUND(22,"Properties file not found"),
    IO_EXCEPTION(23,"I/O Exception when recovering the properties file"),
    REQUEST_NULL(24,"The request cannot be null"),
    REQUEST_ID_NULL(25,"The user id cannot be null or empty"),
    REQUEST_R_CODE_NULL(26,"The registration code cannot be null or empty"),
    REQUEST_SERIAL_NULL(27,"The serial number cannot be null or empty"),
    REQUEST_RECODE_NULL(28,"The re creation code cannot be null or empty"),
    TOKEN_NOT_EXIST(29,"The given token does not exist"),
    ADMIN_UNLOCK_ERROR(30,"Error when getting the unlock code for the soft token"),
    USER_NOT_EXIST(31,"The user does not exist"),
    REQUEST_UNLOCK_PIN_NULL(32,"The unlock pin cannot be null or empty"),
    ADMIN_USER_UNLOCK_ERROR(33,"Error when unlocking the user"),
    REQUEST_UNLOCK_USER_ERROR(34,"The unlock user code cannot be null or empty"),
    OCB_LOGIN_ERROR(35,"Error when executing the login into OCB"),
    OCB_LOGOUT_ERROR(36,"Error when executing the logout of OCB"),
    REQUEST_OCB_VERIFY_NULL(37,"The ocb verifier request cannot be null"),
    REQUEST_PASSWORD_NULL(38,"The user password cannot be empty or null"),
    ADMIN_SYNC_ERROR(39,"Error when syncronizing the user token"),
    REQUEST_SYNC_NULL(40,"The syncronization request cannot be null"),
    CRM_NOT_FOUND(41,"Could not retrieve customer information for this id"),
    CRM_EXCEPTION(42,"Exception when executing the CRM service: BusquedaCliente"),
    TELEPHONE_EXCEPTION(43,"It was not possible to find phone number, review user settings"),
    SP05_AUTH_INIT_ERROR(44,"Error when executing the Init on OCB-SP05"),
    SP05_AUTH_MFA_ERROR(45,"Error when executing the Init on OCB-SP05"),
    MALFORMED_URL_GETTING_ACCOUNT_INFORMATION_ESB(46,"URL Malformed when trying to get account info at esb"),
    UNEXPECTED_ERROR_GETTING_ACCOUNT_INFORMATION_ESB(47,"Unexpected error when trying to get account info at esb"),
    VOUCHER_NOT_FOUND(48,"Error when find voucher, it seems voucher does not exist"),
    PAYER_DAILY_DEBIT_LIMIT_EXCEEDED(49,"payer exceeded daily limit"),
    PAYEE_DAILY_DEBIT_LIMIT_EXCEEDED(50,"payee exceeded daily limit"),
    PAYER_MONTHLY_DEBIT_LIMIT_EXCEEDED(51,"payer exceeded monthly limit"),
    PAYEE_MONTHLY_DEBIT_LIMIT_EXCEEDED(52,"payee exceeded monthly limit"),
    PAYER_WEEKLY_DEBIT_LIMIT_EXCEEDED(53,"payer exceeded weekly limit"),
    PAYEE_WEEKLY_DEBIT_LIMIT_EXCEEDED(54,"payee exceeded weekly limit"),
    VERIFYING_PARTICIPANTS(55,"Unexpected error when checking participants"),
    AMOUNT_SINGLE_DEBIT_LIMIT_EXCEEDED(56,"txn exceeded amount single debit limit"),
    AMOUNT_SINGLE_CREDIT_LIMIT_EXCEEDED(57,"txn exceeded amount single credit limit"),
    AMOUNT_SINGLE_DEBIT_MINIMUM_EXCEEDED(58,"txn exceeded amount single debit minimum"),
    AMOUNT_SINGLE_CREDIT_MINIMUM_EXCEEDED(59,"txn exceeded amount single credit minimum"),
    ERROR_ON_VERIFY(60,"txn got and error on verify"),
    NOT_PROPERLY_CONFIGURATION_ON_PAYER(61,"Payer is not configured properly, please check it."),
    NOT_PROPERLY_CONFIGURATION_ON_PAYEE(62,"Payee is not configured properly, please check it."),
    NOT_CONFIGURATION_LIMITS_ON_CST_TYPE_PAYER(63,"Limits on payer customer type not properly configured, please check it."),
    NOT_CONFIGURATION_LIMITS_ON_CST_TYPE_PAYEE(64,"Limits on payer customer type not properly configured, please check it."),
    NOT_FOUND_PAYEE_ATM(65,"Payer not found for ATM"),
    NOT_FOUND_PI(66,"Payer PI not found"),
    MISSING_PAYER_PI(67,"Payer not found in request"),
    MISSING_OCB_USER(68,"OCB USER not found in request"),
    MISSING_ACCOUNT_FROM_BANK(69,"Any account not found in Bank"),
    ERROR_ACCOUNTING_TRANSFER_FROM_BANK(70,"Error invoking SIOSTransferenciaContable service"),
    MISSING_OCB_SESSION_KEY(71,"Ocb user session key is required"),
    CUSTOM_ERROR_GETTING_ACCOUNTS_SERVICE(72,"Custom error getting accounts when esb got the service response"),
    EXP_ERROR_PO_GETTING_ACCOUNTS(73,"Error getting accounts when esb call was executed"),
    MISSING_TXN_ON_REQUEST(74,"Error getting confirm request transaction or id transaction is missing"),
    MISSING_TXN_DOES_NOT_EXIST(75,"Error finding transaction, it seems it does not exist"),
    CUSTOM_ERROR_ACCOUNTING_TRANSFER_ESB(76, "Custom error accounting transfer when esb got the service response"),
    NOT_FOUND_USE_CASE(76, "use case not found"),
    NOT_FOUND_BANK_PAYMENT_SERVICE_ACTION(77, "action not found"),
    NOT_SUPPORTED_VOUCHER_PROCESS_CODE(78, "action or processing code not supported"),
    NOT_SUPPORTED_TXN_ID_BANK_PAYMENT_SERVICE_ACTION(79, "This action doest not support an txn id"),
    ALREADY_PROCESSED_TXN(80, "Transaction already processed"),
    NOT_FOUND_CURRENCY_IN_REQ(81, "Currency not found in request"),
    NOT_FOUND_CURRENCY(82, "Currency not found"),
    ;


    private Integer code;
    private String message;

    /**
     * Constructor generico. Recibe el codigo y la descripcion del enum
     * @param code codigo
     * @param message mensaje
     */
    AuthorizerError(final Integer code, final String message){
        this.code = code;
        this.message = message;
    }

    /**
     * Obtiene el codigo del enum
     * @return el codigo
     */
    public int getCode() {
        return this.code;
    }

    /**
     * Define el codigo del enum
     * @param code el nuevo codigo
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * Obtiene el mensaje del enum
     * @return el mensaje
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Define el mensaje del enum
     * @param message el nuevo mensaje
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Retorna el codigo y descripcion del enum para impresion en logs
     * @return el string con la informacion
     */
    @Override
    public String toString(){
        return getCode() + "|" + getMessage();
    }
}
