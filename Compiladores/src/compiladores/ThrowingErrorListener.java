package compiladores;

import org.antlr.v4.codegen.model.Recognizer;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class ThrowingErrorListener extends BaseErrorListener{
    
    public static final  ThrowingErrorListener INSTANCE = new ThrowingErrorListener();
        
   @Override
    public void syntaxError(Recognizer recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositioninline, 
                            String msg,
                            RecognitionException e)
            throws ParseCancellationException{ 
        throw new ParseCancellationException("erro");          
    }
    
            
    
}
