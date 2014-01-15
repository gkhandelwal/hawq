package com.pivotal.pxf.api.exception;

/*
 * Exception class that represents any problem that occurred while fetching or parsing
 * a record from the user's input data. Any place in the Bridge code that
 * encounters such a data problem will throw this exception. There is one place in the 
 * bridge code that catches the exception, and reacts by issuing a GPDBWritable record
 * with the errorFlag set. - This catch logic is located in ReadBridge.GetNext()
 */
public class BadRecordException extends Exception 
{
	public BadRecordException() {}
    
    public BadRecordException(Throwable cause) { super(cause); }
    
    public BadRecordException(String message) { super(message); }
}