/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcInvestUnitField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcInvestUnitField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInvestUnitField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcInvestUnitField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcInvestUnitField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiv6v3v11JNI.CThostFtdcInvestUnitField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcInvestUnitField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpapiv6v3v11JNI.CThostFtdcInvestUnitField_InvestorID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcInvestUnitField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ctpapiv6v3v11JNI.CThostFtdcInvestUnitField_InvestUnitID_get(swigCPtr, this);
  }

  public void setInvestorUnitName(String value) {
    ctpapiv6v3v11JNI.CThostFtdcInvestUnitField_InvestorUnitName_set(swigCPtr, this, value);
  }

  public String getInvestorUnitName() {
    return ctpapiv6v3v11JNI.CThostFtdcInvestUnitField_InvestorUnitName_get(swigCPtr, this);
  }

  public void setInvestorGroupID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcInvestUnitField_InvestorGroupID_set(swigCPtr, this, value);
  }

  public String getInvestorGroupID() {
    return ctpapiv6v3v11JNI.CThostFtdcInvestUnitField_InvestorGroupID_get(swigCPtr, this);
  }

  public void setCommModelID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcInvestUnitField_CommModelID_set(swigCPtr, this, value);
  }

  public String getCommModelID() {
    return ctpapiv6v3v11JNI.CThostFtdcInvestUnitField_CommModelID_get(swigCPtr, this);
  }

  public void setMarginModelID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcInvestUnitField_MarginModelID_set(swigCPtr, this, value);
  }

  public String getMarginModelID() {
    return ctpapiv6v3v11JNI.CThostFtdcInvestUnitField_MarginModelID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcInvestUnitField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ctpapiv6v3v11JNI.CThostFtdcInvestUnitField_AccountID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcInvestUnitField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ctpapiv6v3v11JNI.CThostFtdcInvestUnitField_CurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcInvestUnitField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcInvestUnitField(), true);
  }

}
