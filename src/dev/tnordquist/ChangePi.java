package dev.tnordquist;

/**
 * CodingBat: Given a string, compute recursively (no loops) a new string where all appearances of
 * "pi" have been replaced by "3.14".
 */
public class ChangePi {

  public String changePi(String str) {

    if (str.length() == 0) {
      return "";
    } else if (str.length() > 1 && str.substring(0, 2).equals("pi")) {
      String repPi = "3.14";
      return repPi + changePi(str.substring(2, str.length()));
    } else {
      return str.substring(0, 1) + changePi(str.substring(1, str.length()));
    }

  }

}
