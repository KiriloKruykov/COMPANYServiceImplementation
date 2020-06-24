/*
 *
 * Classname: Main
 *
 * @version 23.06.2020
 * @author Kryukov Kirilo

 * Module 4 task Final
 *
 *      COMPANY Service implementation - 15 points
 *
 *      1. Create a test set of companies in your main class.
 *
 *      2.  Take for this set  IT-companies:  Chief, Lawyer, Developer
 *      (Design,  Front-end, Back-end, DevOps). See attch.
 *
 *      3. Take into account 4 different cases  for a company
 *      ( on-top, on bottom, in the node,  out of chain)
 *
 *      4. Test all this cases in your main class.
 *
 *      5. Implement the interface in a class CompanyService.
 *
 *
 *
 */
package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//Create a object and Array List

        CompanyServiceImpl service = new CompanyServiceImpl();

        List<Company> companies = new ArrayList<>();
        Company chief = new Company(null,45);
        Company lawyer = new Company(chief,23);
        Company developer = new Company(chief,14);
        Company backEnd = new Company(developer,20);
        Company frontEnd = new Company(developer,14);
        Company devOps = new Company(backEnd,16);
        Company design = new Company(frontEnd,17);
        Company accounting = new Company(null,6);


        System.out.println(service.getTopLevelParent(chief));
        System.out.println(service.getTopLevelParent(developer));
        System.out.println(service.getTopLevelParent(lawyer));
        System.out.println(service.getTopLevelParent(backEnd));
        System.out.println(service.getTopLevelParent(frontEnd));
        System.out.println(service.getTopLevelParent(devOps));
        System.out.println(service.getTopLevelParent(design));
        System.out.println(service.getTopLevelParent(accounting));

        Arrays.asList(chief,lawyer,developer,backEnd,frontEnd,devOps,design,accounting);

//Finding a parent of a company.

        System.out.println("Parent company for company Chief is: \n"
                + service.getTopLevelParent(chief));
        System.out.println("Parent company for company Lawyer is: \n"
                + service.getTopLevelParent(developer));
        System.out.println("Parent company for company Developer is: \n"
                + service.getTopLevelParent(lawyer));
        System.out.println("Parent company for company Back-End is: \n"
                + service.getTopLevelParent(backEnd));
        System.out.println("Parent company for company Front-End is: \n"
                + service.getTopLevelParent(frontEnd));
        System.out.println("Parent company for company DevOps is: \n"
                + service.getTopLevelParent(devOps));
        System.out.println("Parent company for company Design is: \n"
                + service.getTopLevelParent(design));
        System.out.println("Parent company for company Accounting is: \n"
                + service.getTopLevelParent(accounting));

//Count employees of company and their childs.

        System.out.println("Chief and childs employees: "+service.getEmployeeCountForCompanyAndChildren(chief, companies));
        System.out.println("Accounting and childs employees: "+service.getEmployeeCountForCompanyAndChildren(accounting, companies));
        System.out.println("Developer and childs employees: "+service.getEmployeeCountForCompanyAndChildren(developer, companies));
    }
}