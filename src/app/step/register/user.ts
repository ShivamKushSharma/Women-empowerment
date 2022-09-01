import { Coursedetails } from "src/app/coursedetails/coursedetails";
import { Signup } from "src/app/signup/signup";

export class User{
    r_id:number=0;
    name:string=``;
	designation:string=``;
	salary:number=0;
	no_of_member:number=0;
	no_of_children:number=0;
    family_income:number=0;
    criteria:string=``;
    aadhar_no:string=``;
    pan_no:string=``;
    email:string=``;
    address:string=``;
    course:string=``;
    User_D:Signup;
    Training_Course:Coursedetails;

}