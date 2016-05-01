package uk.co.liamnewmarch.daydream;

import android.webkit.HttpAuthHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewAuthClient extends WebViewClient {

    private String m_userName;
    private String m_password;

    public WebViewAuthClient(String userName, String password)
    {
        m_userName = userName;
        m_password = password;
    }
    @Override
    public void onReceivedHttpAuthRequest(WebView view,
                                          HttpAuthHandler handler, String host, String realm) {
        if (m_userName == null || m_password == null)
        {
            handler.cancel();
            return;
        }

        handler.proceed (m_userName, m_password);
    }
}
