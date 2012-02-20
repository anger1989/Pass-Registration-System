 function checkForm(obj){
                var return_value = true;        
                var pnumber = /[0-9a-z_]+@[0-9a-z_^.]+.[a-z]{2,3}/i;               
                var name = /[a-z]+/i;
                var lastname = /[a-z]+/i;                
                var reg_pnumber = obj.pnumber.value;
                var reg_name = obj.name.value;
                var reg_lastname=obj.lastname.value;
                var error_msg = "Incorrectly field: ";
               
                if(pnumber.exec(reg_pnumber) == null && reg_pnumber ==""){
                    error_msg += "Plane number ";
                    return_value = false;
                }

                if(name.exec(reg_name) == null && reg_name ==""){
                    error_msg += "Name ";
                    return_value = false;
                }

                if(lastname.exec(reg_lastname) == null && reg_lastname ==""){
                    error_msg += "Last name ";
                    return_value = false;
                }

                if(!return_value)
                    alert(error_msg);
                  
                return return_value;
            }