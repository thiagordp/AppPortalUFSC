package br.ufsc.fabricadesoftware.appportalufsc.principal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;

import br.ufsc.fabricadesoftware.appportalufsc.R;
import br.ufsc.fabricadesoftware.appportalufsc.classes_auxiliares.Item;

/**
 * Created by Thiago on 09/12/2014.
 */
public class Adapter extends BaseAdapter {
    private List<Item> item = new LinkedList<Item>();
    private LayoutInflater inflater;

    public Adapter(Context context) {
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return item.size();
    }

    @Override
    public Object getItem(int position) {
        return item.get(position);
    }

    @Override
    public long getItemId(int position) {
        return item.get(position).getDrawableId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        View v = convertView;
        ImageView picture;
        TextView name;

        if (v == null) {
            v = inflater.inflate(R.layout.griditem, viewGroup, false);
            v.setTag(R.id.picture, v.findViewById(R.id.picture));
            v.setTag(R.id.text, v.findViewById(R.id.text));
        }

        picture = (ImageView) v.getTag(R.id.picture);
        name = (TextView) v.getTag(R.id.text);

        Item item = (Item) getItem(position);

        picture.setImageResource(item.getDrawableId());
        name.setText(item.getNome());

        return null;
    }
}
