/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcErrExecOrderActionField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcErrExecOrderActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcErrExecOrderActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcErrExecOrderActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_InvestorID_get(swigCPtr, this);
  }

  public void setExecOrderActionRef(int value) {
    ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_ExecOrderActionRef_set(swigCPtr, this, value);
  }

  public int getExecOrderActionRef() {
    return ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_ExecOrderActionRef_get(swigCPtr, this);
  }

  public void setExecOrderRef(String value) {
    ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_ExecOrderRef_set(swigCPtr, this, value);
  }

  public String getExecOrderRef() {
    return ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_ExecOrderRef_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_RequestID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_SessionID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setExecOrderSysID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_ExecOrderSysID_set(swigCPtr, this, value);
  }

  public String getExecOrderSysID() {
    return ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_ExecOrderSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_UserID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_InvestUnitID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_MacAddress_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return ctpapiv6v3v11JNI.CThostFtdcErrExecOrderActionField_ErrorMsg_get(swigCPtr, this);
  }

  public CThostFtdcErrExecOrderActionField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcErrExecOrderActionField(), true);
  }

}
