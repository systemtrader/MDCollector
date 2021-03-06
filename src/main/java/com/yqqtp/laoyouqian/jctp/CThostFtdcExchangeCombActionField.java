/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.yqqtp.laoyouqian.jctp;

public class CThostFtdcExchangeCombActionField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcExchangeCombActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeCombActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiv6v3v11JNI.delete_CThostFtdcExchangeCombActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDirection(char value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_Direction_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_Volume_get(swigCPtr, this);
  }

  public void setCombDirection(char value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_CombDirection_set(swigCPtr, this, value);
  }

  public char getCombDirection() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_CombDirection_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_HedgeFlag_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_ActionLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_InstallID_get(swigCPtr, this);
  }

  public void setActionStatus(char value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_ActionStatus_set(swigCPtr, this, value);
  }

  public char getActionStatus() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_ActionStatus_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_NotifySequence_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_SettlementID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_SequenceNo_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_MacAddress_get(swigCPtr, this);
  }

  public void setComTradeID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_ComTradeID_set(swigCPtr, this, value);
  }

  public String getComTradeID() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_ComTradeID_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return ctpapiv6v3v11JNI.CThostFtdcExchangeCombActionField_BranchID_get(swigCPtr, this);
  }

  public CThostFtdcExchangeCombActionField() {
    this(ctpapiv6v3v11JNI.new_CThostFtdcExchangeCombActionField(), true);
  }

}
