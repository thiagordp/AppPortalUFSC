package br.ufsc.fabricadesoftware.appportalufsc.classes_auxiliares;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by Thiago on 09/12/2014.
 */
public class GradeDeImagem extends ImageView {
    public GradeDeImagem(Context context) {
        super(context);
    }

    public GradeDeImagem(Context context, AttributeSet attributeSet, int defStyle) {
        super(context, attributeSet, defStyle);
    }

    public GradeDeImagem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
