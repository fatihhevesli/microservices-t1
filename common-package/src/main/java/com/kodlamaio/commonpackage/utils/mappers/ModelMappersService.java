package com.kodlamaio.commonpackage.utils.mappers;

import org.modelmapper.ModelMapper;

interface ModelMappersService {
    ModelMapper forRequest();
    ModelMapper forResponse();
}

    