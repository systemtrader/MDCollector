/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcVerifyFuturePasswordAndCustInfoField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcVerifyFuturePasswordAndCustInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcVerifyFuturePasswordAndCustInfoField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcVerifyFuturePasswordAndCustInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCustomerName(String value) {
    ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_CustType_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_Password_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_CurrencyID_get(swigCPtr, this);
  }

  public void setLongCustomerName(String value) {
    ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_LongCustomerName_set(swigCPtr, this, value);
  }

  public String getLongCustomerName() {
    return ctpapiv6v3v11JNI.CThostFtdcVerifyFuturePasswordAndCustInfoField_LongCustomerName_get(swigCPtr, this);
  }

  public CThostFtdcVerifyFuturePasswordAndCustInfoField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcVerifyFuturePasswordAndCustInfoField(), true);
  }

}