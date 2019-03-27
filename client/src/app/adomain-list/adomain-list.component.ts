import { Component, OnInit } from '@angular/core';
import { AdomainService } from '../shared/adomain/adomain.service';


@Component({
  selector: 'app-adomain-list',
  templateUrl: './adomain-list.component.html',
  styleUrls: ['./adomain-list.component.css']
})
export class AdomainListComponent implements OnInit {
  adomains: Array<any>;


  constructor(private adomainService: AdomainService) { }

  ngOnInit() {
    this.adomainService.getAll().subscribe(data => {
        this.adomains = data;
      });
  }

}
