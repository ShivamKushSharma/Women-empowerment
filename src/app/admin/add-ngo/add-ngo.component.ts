import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { NgoService } from 'src/app/ngo.service';
import { Ngo } from 'src/app/ngoregistration/ngo';

@Component({
  selector: 'app-add-ngo',
  templateUrl: './add-ngo.component.html',
  styleUrls: ['./add-ngo.component.css']
})
export class AddNgoComponent implements OnInit {
  ngo:Ngo=new Ngo();
  ngoList:Ngo[]=[];
  addngoForm!:FormGroup;

  constructor(private fb:FormBuilder,private ngoSer:NgoService, private router:Router) { }

  ngOnInit(): void {
    this.addngoForm = this.fb.group({            
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
   this.ngo=this.addngoForm.value;
    this.ngoSer.addNgo(this.ngo).subscribe(data => {
      

        alert("Registered Successfully!");
        console.log(this.addngoForm.value)
      });

     this.router.navigate(['admin']);
    
  }

}
