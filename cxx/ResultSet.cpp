//
// Created by rmclaren on 6/30/21.
//

#include "ResultSet.h"
#include "query_interface.h"


namespace bufr
{
    ResultSet::ResultSet()
    {
        Address data_ptr;
        result_set__allocate_f(&data_ptr);
        initialize(data_ptr, true);
    }

    ResultSet::~ResultSet()
    {
        if (is_owned_)
        {
            result_set__deallocate_f(data_ptr_);
        }
    }

    std::vector<float> ResultSet::get(const std::string& field_name,
                                       const std::string& for_field) const
    {
        double* data_ptr = nullptr;
        std::size_t data_len;
        result_set__get_f(class_data_ptr_,
                          field_name.c_str(),
                          for_field.c_str(),
                          &data_ptr,
                          &data_len);

        auto data_d =  std::vector<double>();

        auto data = std::vector<float>();
        data.resize(data_d.size());

        for (const auto& dataElement : data_d)
        {
            data.push_back(static_cast<double> (dataElement));
        }

        data.assign(data_ptr, data_ptr + data_len);
        return data;
    }

    Address ResultSet::get_v_ptr()
    {
        return &__modq_result_set_MOD___vtab_modq_result_set_Resultset;
    }
}
