import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { User } from 'src/app/step/register/user';
import { UserService } from 'src/app/user.service';

@Component({
  selector: 'app-edittrainee',
  templateUrl: './edittrainee.component.html',
  styleUrls: ['./edittrainee.component.css']
})
export class EdittraineeComponent implements OnInit {

  e1:any;
  user:User=new User();
  edittraineeForm!: FormGroup;


  
  constructor(private fb:FormBuilder,private userSer:UserService,private router:Router) { }

  ngOnInit(): void {
    this.edittraineeForm = this.fb.group({    
       r_id:[],       
      name: ['', Validators.required],
      designation: ['', Validators.required],
      salary: ['', Validators.required],
      no_of_member: ['', Validators.required],
      no_of_children: ['', Validators.required],
      family_income: ['', Validators.required],
      criteria: ['', Validators.required],
      aadhar_no: ['', Validators.required],
      pan_no: ['', Validators.required],
      email: ['', Validators.required],
      address: ['', Validators.required] ,
     course: ['', Validators.required] ,
      u_id: ['', Validators.required] ,
      training_course:['', Validators.required] ,                               
        });
    this.e1=sessionStorage.getItem("User",);  //capturing the object
    console.log(this.e1);
    this.edittraineeForm.setValue(JSON.parse(this.e1));
    let id=this.e1.id;
  }
  onSubmit(){
  //  alert('meow');
    this.e1=sessionStorage.getItem("User",);
   // alert(this.e1);
    this.user=this.edittraineeForm.value;
   // alert(this.edittraineeForm.value)
   // alert(this.user);
    this.userSer.updateUser(this.user).subscribe(data =>{
      
      alert("regi");
      console.log(this.edittraineeForm.value)
      
    });
       this.router.navigate(['admin/displaytrainee'])
    
  }

}
