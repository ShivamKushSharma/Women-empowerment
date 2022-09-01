import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { CriteriaComponent } from './ngos/criteria/criteria.component';
import { FundingNormsComponent } from './ngos/funding-norms/funding-norms.component';
import { OrganizationsComponent } from './ngos/organizations/organizations.component';
//  import { RegistrationComponent } from './ngos/registration/registration.component';
import { StatusComponent } from './ngos/status/status.component';
import { OrganizationComponent } from './organization/organization.component';
import { NGOsComponent } from './ngos/ngos.component';
import { ContactusComponent } from './contactus/contactus.component';
import { NgoregistrationComponent } from './ngoregistration/ngoregistration.component';
import { AboutusComponent } from './step/aboutus/aboutus.component';
import { GuidelinesComponent } from './step/guidelines/guidelines.component';
import { FaqComponent } from './step/faq/faq.component';

import { TrainingsectorsComponent } from './step/trainingsectors/trainingsectors.component';
import { RegisterComponent } from './step/register/register.component';
import { StepComponent } from './step/step.component';
import { NgodetailsComponent } from './ngodetails/ngodetails.component';
import { SignupComponent } from './signup/signup.component';
import { LoginComponent } from './login/login.component';
import { AddNgoComponent } from './admin/add-ngo/add-ngo.component';
// import { AdminComponent } from './admin/admin.component';
import { HomemainComponent } from './homemain/homemain.component';
import { CoursedetailsComponent } from './coursedetails/coursedetails.component';
import { CrudngoComponent } from './crudngo/crudngo.component';
import { DisplayngoComponent } from './admin/displayngo/displayngo.component';
import { EditngoComponent } from './admin/editngo/editngo.component';
import { AddtraineeComponent } from './admin/addtrainee/addtrainee.component';
import { CrudtraineeComponent } from './crudtrainee/crudtrainee.component';
import { DisplaytraineeComponent } from './admin/displaytrainee/displaytrainee.component';
import { EdittraineeComponent } from './admin/edittrainee/edittrainee.component';
import { AdminComponent } from './admin/admin.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { PolicyComponent } from './policy/policy.component';
import { BackgroundComponent } from './background/background.component';


const routes: Routes = [
  {path:'organizations',component:OrganizationsComponent},
  {path:'organization',component:OrganizationComponent},
  {path:'criteria',component:CriteriaComponent},
  {path:'status',component:StatusComponent},
  {path:'home',component:HomeComponent},
  {path:'funding-norms',component:FundingNormsComponent},
  {path:'ngos',component:NGOsComponent},
  {path:'contactus',component:ContactusComponent},
  {path:'ngoregistration',component:NgoregistrationComponent},
  {path:'aboutus',component:AboutusComponent},
  {path:'guidelines',component:GuidelinesComponent},
  {path:'faq',component:FaqComponent},
 
  {path:'register',component:RegisterComponent},
  {path:'status',component:StatusComponent},
  {path:'trainingsectors',component:TrainingsectorsComponent},
  {path:'step',component:StepComponent},
  {path:'ngodetails',component:NgodetailsComponent},
  {path:'signup',component:SignupComponent},
  {path:'login',component:LoginComponent},
  {path:'admin/add_ngo',component:AddNgoComponent},
  {path:'admin',component:AdminComponent},
  {path:'homemain',component:HomemainComponent},
  {path:'coursedetails',component:CoursedetailsComponent},
  {path:'crudngo',component:CrudngoComponent},
  {path:'admin/displayngo',component:DisplayngoComponent},
  {path:'admin/editngo',component:EditngoComponent},
  {path:'admin/addtrainee',component:AddtraineeComponent},
  {path:'crudtrainee',component:CrudtraineeComponent},
  {path:'admin/displaytrainee',component:DisplaytraineeComponent},
  {path:'admin/edittrainee',component:EdittraineeComponent},
  {path:'adminlogin',component:AdminloginComponent},
  {path:'policy',component:PolicyComponent},
  {path:'background',component:BackgroundComponent},

  

  




 
  // {path:'register',component:RegistrationComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents=[OrganizationsComponent]
