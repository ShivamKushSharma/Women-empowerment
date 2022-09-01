import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router, TitleStrategy } from '@angular/router';
import { NgoService } from '../ngo.service';
import { Ngo } from './ngo';

@Component({
  selector: 'app-ngoregistration',
  templateUrl: './ngoregistration.component.html',
  styleUrls: ['./ngoregistration.component.css']
})
export class NgoregistrationComponent implements OnInit {

  ngoRegForm!: FormGroup;
  ngo:Ngo=new Ngo();
  constructor(private fb:FormBuilder,private ngoSer:NgoService, private router: Router) { }

  ngoList:Ngo[]=[];
  ngOnInit(): void {

    this.ngoRegForm = this.fb.group({            
      // id: ['', Validators.required],                                        
      ngo_name: ['', Validators.required],
      ngo_address: ['', Validators.required] ,
     ngo_phone: ['', Validators.required] ,
     orgType: ['', Validators.required],
    incharge: ['', Validators.required]                                  
        });
    this.ngoSer.getNgoList().subscribe(data=>this.ngoList=data);

  }
  onSubmit(){
    // alert(this.ngoRegForm.value);
   this.ngo=this.ngoRegForm.value;
    this.ngoSer.addNgo(this.ngo).subscribe(data => {
      

        alert("Registered Successfully!");
        console.log(this.ngoRegForm.value)
      });

     this.router.navigate(['ngos']);
    
  }
}



