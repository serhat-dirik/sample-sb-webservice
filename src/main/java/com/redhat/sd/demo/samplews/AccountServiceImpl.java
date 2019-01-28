package com.redhat.sd.demo.samplews;

import java.util.logging.Logger;
import java.util.List;
import java.util.ArrayList;

@javax.jws.WebService(serviceName = "AccountService", portName = "AccountServicePort",
                    targetNamespace = "http://com.redhat.sd.demo/",
                    endpointInterface = "com.redhat.sd.demo.samplews.AccountService")
public class AccountServiceImpl implements AccountService {

    private static final Logger LOG = Logger.getLogger(AccountServiceImpl.class.getName());

    public List<Account> getAccounts() {
        try {
            ArrayList<Account> list = new ArrayList<Account>();
            for (int i = 1; i <= 200; i++) {
              Account account = new Account();
              account.setId(i);
              account.setFirstName("First Name_" + i);
              account.setLastName("Last Name_" + i);
              account.setEmail("Name_" + i + "@redhat.com");
              account.setCompany("red hat");
              account.setAddressLine1("AddressLine1_" + i);
              account.setAddressLine2("AddressLine2_" + i);
              account.setTotal(10000*i);
              account.setCharges(100*i);
              list.add(account);
            }
            return list;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    public Account getAccount(String id){
      Account account = new Account();
      account.setId(java.lang.Integer.valueOf(id));
      account.setFirstName("First Name_" + id);
      account.setLastName("Last Name_" + id);
      account.setEmail("Name_" + id + "@redhat.com");
      account.setCompany("red hat");
      account.setAddressLine1("AddressLine1_" + id);
      account.setAddressLine2("AddressLine2_" + id);
      account.setTotal(10000*java.lang.Integer.valueOf(id));
      account.setCharges(100*java.lang.Integer.valueOf(id));
      return account;
    }

}
