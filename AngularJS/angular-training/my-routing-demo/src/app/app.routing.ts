	import { Routes, RouterModule } from '@angular/router';
	import { HomeComponent } from './home.component';
	import { AddUserComponent } from './add-user.component';
	
	// define my routes
	const routes : Routes = [
	  { path : '', component : HomeComponent},  // default route
	  { path : 'add-user', component : AddUserComponent}
	];
	
	// configure routes for root module
export const routing = RouterModule.forRoot(routes);
