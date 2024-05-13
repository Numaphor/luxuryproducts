import { CommonModule } from '@angular/common';
import { ChangeDetectionStrategy, Component } from '@angular/core';

@Component({
    selector: 'app-giftcard',
    standalone: true,
    imports: [
        CommonModule,
    ],
    templateUrl: './giftcard.component.html',
    styleUrl: './giftcard.component.css',
    changeDetection: ChangeDetectionStrategy.OnPush,
})
export class GiftcardComponent { }
