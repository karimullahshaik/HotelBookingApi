package com.hotel.booking.response;

public enum ServicesErrorCode {
	SUCCESS(0, "Successfully Processed"), 
	UNABLE_TO_PROCESS_REQUEST(100,"Unable to process request"), 
	ORDER_NOT_CREATED(101, "Recipient does not exist for the provided Email"),
	INVALID_REQUEST(102, "Input Request Invalid"),
	NO_DATA_AVAILABLE(103, "Data is unavailable for the request input")

	;

	private int errorCode;

	private String errorMessage;

	private static final String ERROR_CODE_PREFIX = "HBAERR";

	ServicesErrorCode(int errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return ERROR_CODE_PREFIX + this.errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}
}
