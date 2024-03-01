public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;
    double raise;

    Employee(String name, double salary, int workHours, int  hireYear){
    this.name=name;
    this.hireYear=hireYear;
    this.salary=salary;
    this.workHours=workHours;

    }

    //Calculate tax applied to salary
     void tax (){
        if(this.salary>0 && this.salary<1000){
            this.tax =this.salary*0;
        }else{
            this.tax=this.salary*0.3;

        }
     }
    //bonus salary for every additional hour worked
     void bonus() {
         if (this.workHours > 40) {
             this.bonus = 30 * (this.workHours - 40);

         }
     }

     //Apply salary raise according to years
        void raiseSalary(){
            if(2021-hireYear<10){
                this.raise=this.salary*0.5;
            }
            else if(2021-hireYear>9 && 2021-hireYear<20){
                this.raise=this.salary*0.10;
            }
            else if(2021-hireYear>19){
                this.raise=this.salary*0.15;
            }
         }
         void personelToString(){
             System.out.println("Adı : " + this.name);
             System.out.println("Maaşı : " + this.salary);
             System.out.println("Çalışma Saati : " + this.workHours);
             System.out.println("Başlangıç Yılı : " + this.hireYear);
             System.out.println("Vergi : " + this.tax);
             System.out.println("Bonus : " + this.bonus);
             System.out.println("Maaş Artışı : " + this.raise);
             System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + this.bonus - this.tax));
             System.out.println("Toplam maaş : " + ((this.salary + this.bonus - this.tax) + this.raise));
         }
     }

