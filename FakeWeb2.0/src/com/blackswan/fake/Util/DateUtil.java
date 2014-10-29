package com.blackswan.fake.Util;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
public class DateUtil {
     public final static String YYYY = "yyyy";
     public final static String MM = "MM";
     public final static String DD = "dd";
     public final static String HH = "hh";
     public final static String YYYY_MM_DD = "yyyy-MM-dd";
     public final static String YYYY_MM = "yyyy-MM";
     public final static String HH_MM_SS = "HH:mm:ss";
     public final static String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
 
     public static String formatStr_yyyyMMddHHmmssS = "yyyy-MM-dd HH:mm:ss.S";
     public static String formatStr_yyyyMMddHHmmss = "yyyy-MM-dd HH:mm:ss";
     public static String formatStr_yyyyMMddHHmm = "yyyy-MM-dd HH:mm";
     public static String formatStr_yyyyMMddHH = "yyyy-MM-dd HH";
     public static String formatStr_yyyyMMdd = "yyyy-MM-dd";
     public static String[] formatStr = { formatStr_yyyyMMddHHmmss,
             formatStr_yyyyMMddHHmm, formatStr_yyyyMMddHH, formatStr_yyyyMMdd }; 
     /**
      * ���캯��
      */
     public DateUtil() {
     }
 
     /**
      * ���ڸ�ʽ������<code>Date</code>���͵����ڸ�ʽ��Ϊ<code>String</code>��
      * 
      * @param date
      *            ����ʽ��������
      *@param pattern
      *            ʱ����ʽ
      *@return һ������ʽ���˵�<code>String</code>����
      */
     public static String format(Date date, String pattern) {
         if (date == null)
             return "";
         else
             return getFormatter(pattern).format(date);
     }
 
     /**
      * Ĭ�ϰ����ڸ�ʽ����yyyy-mm-dd��ʽ
      * 
      * @param date
      * @return
      */
     public static String format(Date date) {
         if (date == null)
             return "";
         else
             return getFormatter(YYYY_MM_DD).format(date);
     }
 
     /**
      *       * ���ַ�������Ĭ��ת��Ϊyyyy-mm-dd��ʽ��Data����
      * 
      * @param strDate
      * @return
      */
     public static Date format(String strDate) {
         Date d = null;
         if (strDate == "")
             return null;
         else
             try {
                 d = getFormatter(YYYY_MM_DD).parse(strDate);
             } catch (ParseException pex) {
                 return null;
             }
         return d;
     }
 
     /**
      * ���ַ�������ת��Ϊfָ����ʽ��Data����
      * 
      * @param strDate
      *            ,f
      * @return
      */
     public static Date format(String strDate, String f) {
         Date d = null;
         if (strDate == "")
             return null;
         else
             try {
                 d = getFormatter(f).parse(strDate);
             } catch (ParseException pex) {
                 return null;
             }
         return d;
     }
 
     /**
      * ���ڽ�������<code>String</code>���͵����ڽ���Ϊ<code>Date</code>��
      * 
      * @param date
      *            ����ʽ��������
      *@param pattern
      *            ������ʽ
      *@exception ParseException
      *                ����������ַ������ܱ�������һ������
      *@return һ������ʽ���˵�<code>Date</code>����
      */
     public static Date parse(String strDate, String pattern)
             throws ParseException {
         try {
        	 return getFormatter(pattern).parse(strDate);
         } catch (ParseException pe) {
             throw new ParseException(
                     "Method parse in Class DateUtils err: parse strDate fail.",
                     pe.getErrorOffset());
         }
         }

     /**
      * ��ȡ��ǰ����
      * 
      * @return һ�����������յ�<code>Date</code>������
      */
     public static synchronized Date getCurrDate() {
         Calendar calendar = Calendar.getInstance();
         return calendar.getTime();
     }
 
     /**
      * ��ȡ��ǰ����
      * 
      * @return һ�����������յ�<code>String</code>�����ڣ���������ʱ���롣yyyy-mm-dd
      */
     public static String getCurrDateStr() {
         return format(getCurrDate(), YYYY_MM_DD);
     }
 
     /**
      * ��ȡ��ǰʱ��
      * 
      * @return һ������������ʱ�����<code>String</code>�����ڡ�hh:mm:ss
      */
     public static String getCurrTimeStr() {
         return format(getCurrDate(), HH_MM_SS);
     }
 
     /**
      * ��ȡ��ǰ����ʱ��,��ʽ: yyyy��MM��dd hh:mm:ss
      * 
      * @return һ������������ʱ�����<code>String</code>�����ڡ�yyyy-MM-dd hh:mm:ss
      */
     public static String getCurrDateTimeStr() {
         return format(getCurrDate(), YYYY_MM_DD_HH_MM_SS);
     }
 
     /**
      * ��ȡ��ǰ��� ��ʽ��yyyy
      * 
      * @return ��ǰ���
      */
     public static String getYear() {
         return format(getCurrDate(), YYYY);
     }
 
     /**
      * ��ȡ��ǰ�·� ��ʽ��MM
      * 
      * @return ��ǰ�·�
      */
     public static String getMonth() 
     {
    	 return format(getCurrDate(), MM);
     }
     /**
      * ��ȡ��ǰ���ں� ��ʽ��dd
      * 
      * @return ��ǰ���ں�
      */
     public static String getDay() 
     {
         return format(getCurrDate(), DD);
     }
     
     /**
      * ������������ʽ�жϸ����ַ����Ƿ�Ϊ�Ϸ���������
      * 
      * @param strDate
      *            Ҫ�жϵ�����
      *@param pattern
      *            ������ʽ
      *@return true ����ǣ����򷵻�false
      */
     public static boolean isDate(String strDate, String pattern) {
         try {
             parse(strDate, pattern);
             return true;
         } catch (ParseException pe) {
             return false;
         }
     }
 
     /**
      * �жϸ����ַ����Ƿ�Ϊ�ض���ʽ���ڣ�������������yyyy-MM-dd������
      * 
      * @param strDate
      *            Ҫ�жϵ�����
      *@return true ����ǣ����򷵻�false
      */
     // public static boolean isDate(String strDate) {
     // try {
     // parse(strDate, YYYY_MM_DD);
     // return true;
     // }
     // catch (ParseException pe) {
     // return false;
     // }
     // }
 
     /**
      * �жϸ����ַ����Ƿ�Ϊ�ض���ʽ��ݣ���ʽ��yyyy������
      * 
      * @param strDate
      *            Ҫ�жϵ�����
      *@return true ����ǣ����򷵻�false
      */
     public static boolean isYYYY(String strDate) {
         try {
             parse(strDate, YYYY);
             return true;
         } catch (ParseException pe) {
             return false;
         }
     }
 
     public static boolean isYYYY_MM(String strDate) {
         try {
             parse(strDate, YYYY_MM);
             return true;
         } catch (ParseException pe) {
             return false;
         }
     }
 
     /**
      * �жϸ����ַ����Ƿ�Ϊ�ض���ʽ�������գ���ʽ��yyyy-MM-dd������
      * 
      * @param strDate
      *            Ҫ�жϵ�����
      *@return true ����ǣ����򷵻�false
      */
     public static boolean isYYYY_MM_DD(String strDate) {
         try {
             parse(strDate, YYYY_MM_DD);
             return true;
         } catch (ParseException pe) {
             return false;
         }
     }
 
     /**
      * �жϸ����ַ����Ƿ�Ϊ�ض���ʽ������ʱ���루��ʽ��yyyy-MM-dd HH:mm:ss������
      * 
      * @param strDate
      *            Ҫ�жϵ�����
      *@return true ����ǣ����򷵻�false
      */
     public static boolean isYYYY_MM_DD_HH_MM_SS(String strDate) {
         try {
             parse(strDate, YYYY_MM_DD_HH_MM_SS);
             return true;
         } catch (ParseException pe) {
             return false;
         }
     }
 
     /**
      * �жϸ����ַ����Ƿ�Ϊ�ض���ʽʱ���루��ʽ��HH:mm:ss������
      * 
      * @param strDate
      *            Ҫ�жϵ�����
      *@return true ����ǣ����򷵻�false
      */
     public static boolean isHH_MM_SS(String strDate) {
         try {
             parse(strDate, HH_MM_SS);
             return true;
         } catch (ParseException pe) {
             return false;
         }
     }
 
     /**
      * �жϸ����ַ����Ƿ�Ϊ�ض���ʽʱ�䣨������ʱ����hh:mm:ss������
      * 
      * @param strTime
      *            Ҫ�жϵ�ʱ��
      *@return true ����ǣ����򷵻�false
      */
     // public static boolean isTime(String strTime) {
     // try {
     // parse(strTime, HH_MM_SS);
     // return true;
     // }
     // catch (ParseException pe) {
     // return false;
     // }
     // }
 
     /**
      * �жϸ����ַ����Ƿ�Ϊ�ض���ʽ����ʱ�䣨������������ʱ���� yyyy-MM-dd hh:mm:ss������
      * 
      * @param strDateTime
      *            Ҫ�жϵ�����ʱ��
      *@return true ����ǣ����򷵻�false
      */
     // public static boolean isDateTime(String strDateTime) {
     // try {
     // parse(strDateTime, YYYY_MM_DD_HH_MM_SS);
     // return true;
     // }
     // catch (ParseException pe) {
     // return false;
     // }
     // }
 
     /**
      * ��ȡһ���򵥵����ڸ�ʽ������
      * 
      * @return һ���򵥵����ڸ�ʽ������
      */
     private static SimpleDateFormat getFormatter(String parttern) {
         return new SimpleDateFormat(parttern);
     }
 
     /**
      * ��ȡ������ǰ�ĺ�intevalDay�������
      * 
      * @param refenceDate
      *            �������ڣ���ʽΪ��yyyy-MM-dd��
      * @param intevalDays
      *            �������
      * @return ����������
      */
     public static String getNextDate(String refenceDate, int intevalDays) {
         try {
             return getNextDate(parse(refenceDate, YYYY_MM_DD), intevalDays);
         } catch (Exception ee) {
             return "";
         }
     }
 
     /**
      * ��ȡ������ǰ�ĺ�intevalDay�������
      * 
      * @param refenceDate
      *            Date ��������
      * @param intevalDays
      *            int �������
      * @return String ����������
      */
     public static String getNextDate(Date refenceDate, int intevalDays) {
         try {
             java.util.Calendar calendar = java.util.Calendar.getInstance();
             calendar.setTime(refenceDate);
             calendar.set(Calendar.DATE, calendar.get(Calendar.DATE)
                     + intevalDays);
             return format(calendar.getTime(), YYYY_MM_DD);
         } catch (Exception ee) {
             return "";
         }
     }
 
     public static long getIntevalDays(String startDate, String endDate) {
         try {
             return getIntevalDays(parse(startDate, YYYY_MM_DD), parse(endDate,
                     YYYY_MM_DD));
         } catch (Exception ee) {
             return 0l;
         }
     }
 
     public static long getIntevalDays(Date startDate, Date endDate) {
         try {
             java.util.Calendar startCalendar = java.util.Calendar.getInstance();
             java.util.Calendar endCalendar = java.util.Calendar.getInstance();
 
             startCalendar.setTime(startDate);
             endCalendar.setTime(endDate);
             long diff = endCalendar.getTimeInMillis()-startCalendar.getTimeInMillis();
 
             return (diff / (1000 * 60 * 60 * 24));
         } catch (Exception ee) {
             return 0l;
         }
     }
 
    /**
      *��ǰ���ں�ָ���ַ������ڵ��������
      * 
      * @param startDate
      * @return
      */
     public static long getTodayIntevalDays(String startDate) {
         try {
             // ��ǰʱ��
             Date currentDate = new Date();
 
             // ָ������
             SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
             java.util.Date theDate = myFormatter.parse(startDate);
 
             // ����ʱ��֮�������
             long days = (currentDate.getTime() - theDate.getTime())
                     / (24 * 60 * 60 * 1000);
 
             return days;
         } catch (Exception ee) {
             return 0l;
         }
     }
 
     public static Date parseToDate(String dateTimeStr) {
         if (dateTimeStr == null)
             return null;
         Date d = null;
         int formatStrLength = formatStr.length;
         for (int i = 0; i < formatStrLength; i++) {
             d = parseToDate2(dateTimeStr, formatStr[i]);
             if (d != null) {
                 break;
             }
         }
         return d;
     }
 
     private static Date parseToDate2(String dateTimeStr, String formatString) {
         Date d = null;
         SimpleDateFormat sdf = new SimpleDateFormat(formatString);
         try {
             d = sdf.parse(dateTimeStr);
         } catch (ParseException pe) {
 
         }
         return d;
     }
 
     public static String dateTimeToString(Date datetime) {
         // dateTime=dateTime.substring(0,4)+dateTime.substring(5,7)+dateTime.substring(8,10)+dateTime.substring(11,13)+dateTime.substring(14,16)+dateTime.substring(17,19);
         // return dateTime;
 
         java.util.GregorianCalendar calendar = new java.util.GregorianCalendar();
        calendar.setTime(datetime);
        String dateTime = calendar.get(Calendar.YEAR) + ""
                 + (calendar.get(Calendar.MONTH) + 1 > 9 ? "" : "0")
                 + (calendar.get(Calendar.MONTH) + 1) + ""
                 + (calendar.get(Calendar.DATE) > 9 ? "" : "0")
                 + calendar.get(Calendar.DATE) + ""
                 + (calendar.get(Calendar.HOUR_OF_DAY) > 9 ? "" : "0")
                 + calendar.get(Calendar.HOUR_OF_DAY) + ""
                 + (calendar.get(Calendar.MINUTE) > 9 ? "" : "0")
                 + calendar.get(Calendar.MINUTE) + ""
                 + (calendar.get(Calendar.SECOND) > 9 ? "" : "0")
                 + calendar.get(Calendar.SECOND);
         return dateTime;
     }
 
     /**
      * ���ꡢ�·ݣ���õ�ǰ�µ����һ��
      * 
      * @param year
      *            month �·� 01 02 11 12
      * @return
      * @throws ParseException
      */
     public static String getLastDayOfMonth(String year, String month)
             throws ParseException {
         String LastDay = "";
         Calendar cal = Calendar.getInstance();
         Date date_;
         Date date = new SimpleDateFormat("yyyy-MM-dd").parse(year + "-" + month
                 + "-14");
         cal.setTime(date);
         int value = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
         cal.set(Calendar.DAY_OF_MONTH, value);
         date_ = cal.getTime();
         LastDay = new SimpleDateFormat("yyyy-MM-dd").format(date_);
         return LastDay;
    }

	public static int getHour()
	{
		// TODO Auto-generated method stub
		return getHour();
	}

	public static String getMinute()
	{
		// TODO Auto-generated method stub
		return getMinute();
	}

	public static String getSecond()
	{
		// TODO Auto-generated method stub
		return getSecond();
	}
}
