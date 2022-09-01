import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgoService } from 'src/app/ngo.service';
import { Ngo } from 'src/app/ngoregistration/ngo';

@Component({
  selector: 'app-organizations',
  templateUrl: './organizations.component.html',
  styleUrls: ['./organizations.component.css']
})
export class OrganizationsComponent implements OnInit {

  ngoList:Ngo[]=[];
  constructor(private ngoSer:NgoService,private router:Router) { }

  ngOnInit(): void {

    this.ngoSer.getNgoList().subscribe(data=>this.ngoList=data);
    

}
}
