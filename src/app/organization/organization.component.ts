import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgoService } from '../ngo.service';
import { Ngo } from '../ngoregistration/ngo';

@Component({
  selector: 'app-organization',
  templateUrl: './organization.component.html',
  styleUrls: ['./organization.component.css']
})
export class OrganizationComponent implements OnInit {
  ngoList:Ngo[]=[];
  constructor(private ngoSer:NgoService,private router:Router) { }

  ngOnInit(): void {

    this.ngoSer.getNgoList().subscribe(data=>this.ngoList=data);
    
  }
  

}
