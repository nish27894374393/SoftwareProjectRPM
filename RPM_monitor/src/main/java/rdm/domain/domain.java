package rdm.domain;

//•	VitalType（TEMP/HEART_RATE/RESP_RATE/SYSTOLIC_BP/DIASTOLIC_BP/ECG）
//      •	VitalSample（patientId, ts, type, value, unit）
//   •	EcgSample（patientId, ts, voltage ）
//    •	AlarmSeverity（NORMAL/WARNING/URGENT）
//  •	AlarmEvent（patientId, ts, vitalType, value, message）
// •	Patient（）