package entidades;

public class Fecha {
  private int year;
  private int month;
  private int day;

  public Fecha() {
    year = 1000;
    month = 1;
    day = 1;
  }

  public Fecha(int year, int month, int day) {
    if (year >= 1000) {
      this.year = year;
    } else {
      System.out.println("Year out of range (< 1000)");
    }
    if (month >= 1 && month <= 12) {
      this.month = month;
    } else {
      System.out.println("Month out of range (<1 or >12)");
    }
    switch (month) {
      case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        if (day >= 1 && day <= 31)
          this.day = day;
        else
          System.out.println("Day out of range (<1 or >31)");
        break;
      case 4: case 6: case 9: case 11:
        if (day >= 1 && day <= 30)
          this.day = day;
        else
          System.out.println("Day out of range (<1 or >30)");
        break;
      case 2:
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
          if (day >= 1 && day <= 29)
            this.day = day;
          else
            System.out.println("Day out of range (<1 or >29)");
        else
          if (day >= 1 && day <= 28)
            this.day = day;
          else
            System.out.println("Day out of range (<1 or >28)");
        break;
      default:
        System.out.println("Month incorrect. Day not set.");
        break;
    }
  }
  
  public void setYear(int year) {
    if (year >= 1000)
      this.year = year;
    else
      System.out.println("Year out of range (< 1000)");
  }

  public void setMonth(int month) {
    if (month >= 1 && month <= 12)
      this.month = month;
    else
      System.out.println("Month out of range (<1 or >12)");
  }

  public void setDay(int day) {
    switch (month) {
      case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        if (day >= 1 && day <= 31)
          this.day = day;
        else
          System.out.println("Day out of range (<1 or >31)");
        break;
      case 4: case 6: case 9: case 11:
        if (day >= 1 && day <= 30)
          this.day = day;
        else
          System.out.println("Day out of range (<1 or >30)");
        break;
      case 2:
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
          if (day >= 1 && day <= 29)
            this.day = day;
          else
            System.out.println("Day out of range (<1 or >29)");
        else
          if (day >= 1 && day <= 28)
            this.day = day;
          else
            System.out.println("Day out of range (<1 or >28)");
        break;
      default:
        System.out.println("Month incorrect. Day not set.");
        break;
    }
  }

  public int getYear() {
    return year;
  }

  public int getMonth() {
    return month;
  }

  public int getDay() {
    return day;
  }

  @Override
  public String toString() {
    return (getDay()<=9?"0"+getDay():getDay()) + "/" + (getMonth()<=9?"0"+getMonth():getMonth()) + "/" + (getYear()<=9?"0"+getYear():getYear());
  }
  
  
}
