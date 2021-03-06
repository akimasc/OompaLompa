package com.oompa.loompa.view.compose



import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.oompa.loompa.data.model.OompaDetail

@Composable
fun OompaListItem(oompaDetail: OompaDetail, selectedItem: (OompaDetail) -> Unit){
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth(),
        elevation = 10.dp,
        shape = RoundedCornerShape(corner = CornerSize(10.dp))
    ){
        Row(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth()
                .clickable { selectedItem(oompaDetail) },
            verticalAlignment = Alignment.CenterVertically
        ) {
            OompaImage(oompaDetail = oompaDetail)
            Column{
                Text(text = oompaDetail.firstName, style = MaterialTheme.typography.h3)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = oompaDetail.profession,  style = MaterialTheme.typography.h5)
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}