/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcQryExchangeOrderField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryExchangeOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryExchangeOrderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcQryExchangeOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParticipantID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcQryExchangeOrderField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ctpapiv6v3v11JNI.CThostFtdcQryExchangeOrderField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcQryExchangeOrderField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ctpapiv6v3v11JNI.CThostFtdcQryExchangeOrderField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcQryExchangeOrderField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ctpapiv6v3v11JNI.CThostFtdcQryExchangeOrderField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcQryExchangeOrderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpapiv6v3v11JNI.CThostFtdcQryExchangeOrderField_ExchangeID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcQryExchangeOrderField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ctpapiv6v3v11JNI.CThostFtdcQryExchangeOrderField_TraderID_get(swigCPtr, this);
  }

  public CThostFtdcQryExchangeOrderField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcQryExchangeOrderField(), true);
  }

}
