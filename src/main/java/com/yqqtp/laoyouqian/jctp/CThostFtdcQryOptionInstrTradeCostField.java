/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcQryOptionInstrTradeCostField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryOptionInstrTradeCostField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryOptionInstrTradeCostField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcQryOptionInstrTradeCostField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcQryOptionInstrTradeCostField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiv6v3v11JNI.CThostFtdcQryOptionInstrTradeCostField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcQryOptionInstrTradeCostField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpapiv6v3v11JNI.CThostFtdcQryOptionInstrTradeCostField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcQryOptionInstrTradeCostField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpapiv6v3v11JNI.CThostFtdcQryOptionInstrTradeCostField_InstrumentID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    ctpapiv6v3v11JNI.CThostFtdcQryOptionInstrTradeCostField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return ctpapiv6v3v11JNI.CThostFtdcQryOptionInstrTradeCostField_HedgeFlag_get(swigCPtr, this);
  }

  public void setInputPrice(double value) {
    ctpapiv6v3v11JNI.CThostFtdcQryOptionInstrTradeCostField_InputPrice_set(swigCPtr, this, value);
  }

  public double getInputPrice() {
    return ctpapiv6v3v11JNI.CThostFtdcQryOptionInstrTradeCostField_InputPrice_get(swigCPtr, this);
  }

  public void setUnderlyingPrice(double value) {
    ctpapiv6v3v11JNI.CThostFtdcQryOptionInstrTradeCostField_UnderlyingPrice_set(swigCPtr, this, value);
  }

  public double getUnderlyingPrice() {
    return ctpapiv6v3v11JNI.CThostFtdcQryOptionInstrTradeCostField_UnderlyingPrice_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcQryOptionInstrTradeCostField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpapiv6v3v11JNI.CThostFtdcQryOptionInstrTradeCostField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcQryOptionInstrTradeCostField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ctpapiv6v3v11JNI.CThostFtdcQryOptionInstrTradeCostField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcQryOptionInstrTradeCostField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcQryOptionInstrTradeCostField(), true);
  }

}
