package com.payload;

import com.omrbranch.pojo.AddAddress_Input_pojo;
import com.omrbranch.pojo.DeleteAddress_Input_pojo;
import com.omrbranch.pojo.Login_output_pojo;
import com.omrbranch.pojo.UpdateAddress_Input_pojo;

public class Payloads {
		
	public AddAddress_Input_pojo createAddress(String first_name, String last_name, String mobile, String apartment, String state,
			String city, String country, String zipcode, String address, String address_type) {

		AddAddress_Input_pojo addAddress_Input_pojo=new AddAddress_Input_pojo(first_name, last_name, mobile, apartment, state, city, country, zipcode, address, address_type);
		return addAddress_Input_pojo;
	
	}
	public UpdateAddress_Input_pojo updateAddress(String address_id, String first_name, String last_name, String mobile,
			String apartment, int state, int city, int country, String zipcode, String address,
			String address_type) {

UpdateAddress_Input_pojo updateAddressInputPojo=new UpdateAddress_Input_pojo(address_id, first_name, last_name, mobile, apartment, state, city, country, zipcode, address, address_type);
return updateAddressInputPojo;
	}

	public DeleteAddress_Input_pojo deleteAddress(String address_id) {
DeleteAddress_Input_pojo deleteAddress_Input_pojo=new DeleteAddress_Input_pojo(address_id);
return deleteAddress_Input_pojo;

	
	}

}
