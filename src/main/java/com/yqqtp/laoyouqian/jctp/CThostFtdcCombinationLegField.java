/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcCombinationLegField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcCombinationLegField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCombinationLegField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcCombinationLegField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCombInstrumentID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcCombinationLegField_CombInstrumentID_set(swigCPtr, this, value);
  }

  public String getCombInstrumentID() {
    return ctpapiv6v3v11JNI.CThostFtdcCombinationLegField_CombInstrumentID_get(swigCPtr, this);
  }

  public void setLegID(int value) {
    ctpapiv6v3v11JNI.CThostFtdcCombinationLegField_LegID_set(swigCPtr, this, value);
  }

  public int getLegID() {
    return ctpapiv6v3v11JNI.CThostFtdcCombinationLegField_LegID_get(swigCPtr, this);
  }

  public void setLegInstrumentID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcCombinationLegField_LegInstrumentID_set(swigCPtr, this, value);
  }

  public String getLegInstrumentID() {
    return ctpapiv6v3v11JNI.CThostFtdcCombinationLegField_LegInstrumentID_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    ctpapiv6v3v11JNI.CThostFtdcCombinationLegField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return ctpapiv6v3v11JNI.CThostFtdcCombinationLegField_Direction_get(swigCPtr, this);
  }

  public void setLegMultiple(int value) {
    ctpapiv6v3v11JNI.CThostFtdcCombinationLegField_LegMultiple_set(swigCPtr, this, value);
  }

  public int getLegMultiple() {
    return ctpapiv6v3v11JNI.CThostFtdcCombinationLegField_LegMultiple_get(swigCPtr, this);
  }

  public void setImplyLevel(int value) {
    ctpapiv6v3v11JNI.CThostFtdcCombinationLegField_ImplyLevel_set(swigCPtr, this, value);
  }

  public int getImplyLevel() {
    return ctpapiv6v3v11JNI.CThostFtdcCombinationLegField_ImplyLevel_get(swigCPtr, this);
  }

  public CThostFtdcCombinationLegField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcCombinationLegField(), true);
  }

}
