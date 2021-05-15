package outentity.imporSelector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
          // 这里的方法不能反悔null  但是可以反悔一个空数组  数组为o

            return new String[0];
    }
}
