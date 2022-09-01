import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { NgoService } from 'src/app/ngo.service';
import { Ngo } from 'src/app/ngoregistration/ngo';

@Component({
  selector: 'app-editngo',
  templateUrl: './editngo.component.html',
  styleUrls: ['./editngo.component.css']
})
export class EditngoComponent implements OnInit {

  e1:any;
  ngo:Ngo=new Ngo();
  editngoForm!: FormGroup;
 

  
  constructor(private fb:FormBuilder,private ngoSer:NgoService,private router:Router) { }

  ngOnInit(): void {
    this.editngoForm = this.fb.group({    
          ngo_id:[],    
      ngo_name: ['', Validators.required],
     ngo_address: ['', Validators.required] ,
    ngo_phone: ['', Validators.required] ,
    orgType: ['', Validators.required],
   incharge: ['', Validators.required]                                  
       });
    this.e1=sessionStorage.getItem("Ngo",);  //capturing the object
    alert(this.e1);
    this.editngoForm.setValue(JSON.parse(this.e1));
       let id=this.e1.id;
  }
  onSubmit(){
    // alert('meow');
    this.e1=sessionStorage.getItem("Ngo",); 
    // alert(this.e1);
    this.ngo=this.editngoForm.value;
    // alert(this.editngoForm.value)
    // alert(this.ngo);
    this.ngoSer.updateNgo(this.ngo).subscribe(data =>{
      
       alert("Data Updated Successfully!");
      console.log(this.editngoForm.value)
      
    });
       this.router.navigate(['admin/displayngo'])
    
  }

}
