package com.crud;
public class DaoOperation
{
    DAO cdao=new DAO();
//    //------------------------------update operation in connection layer
    public void updatecon(StdModel S)
    {
        if((cdao.searchbyid(S.getId())).getId()==0)
        {
            cdao.creatstudent(S);
        }
        else {	cdao.update(S);	}
    }
//    //---------------------------delete operation in connection layer
    public void deletecon(int id)
    {
        StdModel s=cdao.searchbyid(id);
        if(s.getId()!=0)
        {
            cdao.delete(id);
        }
    }


}