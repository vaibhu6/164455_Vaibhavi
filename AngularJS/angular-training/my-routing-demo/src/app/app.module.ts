import { BrowserModule } from '@angular/platform-browser';
	import { NgModule } from '@angular/core';
	import { FormsModule } from '@angular/forms';
	import { HttpClientModule } from '@angular/common/http';
	import { routing } from './app.routing';
	
	import { LocationStrategy, HashLocationStrategy } from '@angular/common';
	
	import { AppComponent } from './app.component';
	import { HomeComponent } from './home.component';
	import { AddUserComponent } from './add-user.component';
	
	@NgModule({
	  declarations: [
	    AppComponent,
	    HomeComponent,
	    AddUserComponent
	  ],
	  imports: [
	    BrowserModule,
	    FormsModule,
	    HttpClientModule,
	    routing
	  ],
	  providers: [ { provide: LocationStrategy, useClass: HashLocationStrategy} ],
	  bootstrap: [AppComponent]
	})
export class AppModule { }
