/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcExchangeMarginRateAdjustField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcExchangeMarginRateAdjustField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeMarginRateAdjustField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcExchangeMarginRateAdjustField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeMarginRateAdjustField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeMarginRateAdjustField_BrokerID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeMarginRateAdjustField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeMarginRateAdjustField_InstrumentID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeMarginRateAdjustField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeMarginRateAdjustField_HedgeFlag_get(swigCPtr, this);
  }

  public void setLongMarginRatioByMoney(double value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeMarginRateAdjustField_LongMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByMoney() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeMarginRateAdjustField_LongMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setLongMarginRatioByVolume(double value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeMarginRateAdjustField_LongMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByVolume() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeMarginRateAdjustField_LongMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setShortMarginRatioByMoney(double value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeMarginRateAdjustField_ShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByMoney() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeMarginRateAdjustField_ShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setShortMarginRatioByVolume(double value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeMarginRateAdjustField_ShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByVolume() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeMarginRateAdjustField_ShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setExchLongMarginRatioByMoney(double value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeMarginRateAdjustField_ExchLongMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getExchLongMarginRatioByMoney() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeMarginRateAdjustField_ExchLongMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setExchLongMarginRatioByVolume(double value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeMarginRateAdjustField_ExchLongMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getExchLongMarginRatioByVolume() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeMarginRateAdjustField_ExchLongMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setExchShortMarginRatioByMoney(double value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeMarginRateAdjustField_ExchShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getExchShortMarginRatioByMoney() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeMarginRateAdjustField_ExchShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setExchShortMarginRatioByVolume(double value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeMarginRateAdjustField_ExchShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getExchShortMarginRatioByVolume() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeMarginRateAdjustField_ExchShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setNoLongMarginRatioByMoney(double value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeMarginRateAdjustField_NoLongMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getNoLongMarginRatioByMoney() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeMarginRateAdjustField_NoLongMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setNoLongMarginRatioByVolume(double value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeMarginRateAdjustField_NoLongMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getNoLongMarginRatioByVolume() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeMarginRateAdjustField_NoLongMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setNoShortMarginRatioByMoney(double value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeMarginRateAdjustField_NoShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getNoShortMarginRatioByMoney() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeMarginRateAdjustField_NoShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setNoShortMarginRatioByVolume(double value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeMarginRateAdjustField_NoShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getNoShortMarginRatioByVolume() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeMarginRateAdjustField_NoShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public CThostFtdcExchangeMarginRateAdjustField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcExchangeMarginRateAdjustField(), true);
  }

}
