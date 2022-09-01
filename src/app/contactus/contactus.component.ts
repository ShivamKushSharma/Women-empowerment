import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-contactus',
  templateUrl: './contactus.component.html',
  styleUrls: ['./contactus.component.css']
})
export class ContactusComponent implements OnInit {
 
  contactForm!:FormGroup;
  constructor(private fb:FormBuilder,  private router: Router) { }

 

  ngOnInit(): void {
  }

  onSubmit(){
    // this.empSer.addEmp(this.contactForm.value).subscribe((data:any) => {
        alert("Message Sent Successfully!");
        //  console.log(this.contactForm.value)
      };

      // this.router.navigate(['emplist']);
    
  }

